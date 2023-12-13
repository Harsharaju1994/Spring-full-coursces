package org.in60min.config;

import org.in60min.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"org.in60min.implementation",
        "org.in60min.services"})
@ComponentScan(basePackageClasses = {org.in60min.bean.Vehicle.class,
        org.in60min.bean.Person.class})
public class AppConfig
{

}
