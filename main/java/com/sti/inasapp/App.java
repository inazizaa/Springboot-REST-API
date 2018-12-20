package com.sti.inasapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sti.inasapp.api.config.DaoSpringConfig;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan({"com.sti.inasapp.api.controller"})
@Configuration
@EnableAutoConfiguration
@Import({DaoSpringConfig.class})
@EnableJpaRepositories({"com.sti.inasapp.api.dao.repository","com.sti.inasapp.api.dao"})
@EntityScan({"com.sti.inasapp.api.model"})
public class App 
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
