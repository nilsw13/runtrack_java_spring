package com.example.finalday.finaldayapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;

import com.example.finalday.finaldayapp.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
    .csrf(csrf -> csrf.disable())
    .authorizeRequests(authorizeRequests -> {
        authorizeRequests
            .requestMatchers("/register").permitAll()
            .requestMatchers("/home").permitAll()
            .anyRequest().authenticated();
    })
    .formLogin(formLogin -> {
        formLogin
            .loginPage("/loginpage")
            .loginProcessingUrl("/loginpage")
            .defaultSuccessUrl("/home", true)
            .permitAll();
    })
    .logout(logout -> {
        logout
            .invalidateHttpSession(true)
            .clearAuthentication(true)
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/loginpage?logout")
            .permitAll();
    });

        return http.build();
    }

    @Autowired
    public void globalConfig(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());

    }

}
