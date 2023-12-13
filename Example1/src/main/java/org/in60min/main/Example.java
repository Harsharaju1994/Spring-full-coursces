package org.in60min.main;


import org.in60min.bean.Vehicle;
import org.in60min.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        System.out.println("Vehicle name : "+vehicle.getName() );

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vrhicle name from spring context : "+veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String : "+ hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Number : "+num);

    }
}
