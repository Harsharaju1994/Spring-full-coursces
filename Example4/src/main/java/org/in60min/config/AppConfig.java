package org.in60min.config;

import org.in60min.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean(name = "ferrarivehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Primary
    @Bean(value = "hondavehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    //@Primary
    @Bean("audivehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
}
