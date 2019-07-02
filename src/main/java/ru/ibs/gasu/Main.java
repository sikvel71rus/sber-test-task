package ru.ibs.gasu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by evgeniy on 28.11.18.
 */
@SpringBootApplication
@Slf4j
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            log.info("Service started!!!!!!!!!");
//        };
//    }

}
