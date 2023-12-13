package org.in60min.main;


import org.in60min.bean.Person;
import org.in60min.bean.Vehicle;
import org.in60min.config.AppConfig;
import org.in60min.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Example14 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices",VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1 : " +vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " +vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }
    }
}
