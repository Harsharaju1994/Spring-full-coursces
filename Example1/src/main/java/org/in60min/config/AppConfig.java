package org.in60min.config;

import org.in60min.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello world...";
    }

    @Bean
    Integer number(){
        return 25;
    }
}
