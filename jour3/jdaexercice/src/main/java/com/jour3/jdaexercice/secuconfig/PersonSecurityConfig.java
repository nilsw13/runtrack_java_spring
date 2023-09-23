package com.jour3.jdaexercice.secuconfig;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class PersonSecurityConfig {
    

    


    @Bean
    InMemoryUserDetailsManager udm(){
        UserDetails user = org.springframework.security.core.userdetails.User.withUsername("user")
                        .password(passwordEncoder().encode("password"))
                        .roles("USER")
                        .build();
    


        UserDetails admin = org.springframework.security.core.userdetails.User.withUsername("admin")
                        .password(passwordEncoder().encode("admin"))
                        .roles("ADMIN")
                        .build();


        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();

        
    }



    @Bean
    SecurityFilterChain ListPersonsecurityFilterChain(HttpSecurity http) throws Exception{
        return http
                    .securityMatcher("/person-list/**")
                    .authorizeHttpRequests(auth ->  {
                        auth.anyRequest().authenticated();
                    })
                    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                    .httpBasic(withDefaults())
                    .build();
    }
}   
