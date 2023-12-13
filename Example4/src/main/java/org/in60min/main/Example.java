package org.in60min.main;


import org.in60min.bean.Vehicle;
import org.in60min.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vrhicle name from spring context : "+veh.getName());


    }
}
