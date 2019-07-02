package ru.ibs.gasu.config;

import org.apache.cxf.bus.spring.SpringBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by evgeniy on 06.12.18.
 */
@Configuration
//@EnableJpaAuditing
@ImportResource({"classpath*:spring/root-context.xml"})
public class Config {

    @Bean
    public SpringBus springBus() {
        return new SpringBus();
    }

}
