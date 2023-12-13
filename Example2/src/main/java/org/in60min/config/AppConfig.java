package org.in60min.config;

import org.in60min.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
}
