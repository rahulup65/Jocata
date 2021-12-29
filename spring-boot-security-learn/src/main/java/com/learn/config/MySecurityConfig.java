package com.learn.config;


import com.fasterxml.jackson.core.format.MatchStrength;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration   // this is configuration class
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)// we used antmatcher so we have to add this annotaions
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    // In this class(WebSecurityConfigureAdapter) alreday many funtions are present and configured we have  to just overide the methods or functions

    // we are performing basic security whatever springBoot is provided that is ok. we are going to do customize


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http

                //.csrf().disable()// when u are using non browser client(postman)  just disable the this scrf is just like attack so spring security provide the security

                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                //csrf genrated token used by server to put and post the json body
                .and()
                .authorizeRequests()

                .antMatchers("/public/**" ).hasRole("NORMAL")
                .antMatchers("/users/**").hasRole("ADMIN")  //insted of this we used @PreAuthorize   annotations
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();// this is for form based authentication we have control over a form
                //.httpBasic(); for the basic
//


    }

    // creating user with password and role


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("jhon").password(this.passwordEncoder().encode("rahul")).roles("NORMAL");
        auth.inMemoryAuthentication().withUser("roshni").password(this.passwordEncoder().encode("rahul")).roles("ADMIN");

    }

    // we are not encoding the password we are taking as plain text only
    // we are not using any password encoder  do not use in the  production level

//    @Bean
//    public PasswordEncoder passwordEncoder(){
//
//        return NoOpPasswordEncoder.getInstance();
//    }

    // encode the password then store it means dont store as a plain text so first the password rahul will encoded then it will store

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder(10);

    }
    //ROLE- high level overview->NORMAL-read
    //Authority->permission->Read
    //ADMIN->read ,write,update

}
