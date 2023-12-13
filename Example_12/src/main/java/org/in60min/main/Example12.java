package org.in60min.main;


import org.in60min.bean.Person;
import org.in60min.bean.Vehicle;
import org.in60min.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Example12 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());

    }
}
