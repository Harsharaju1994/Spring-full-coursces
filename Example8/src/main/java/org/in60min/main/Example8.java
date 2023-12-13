package org.in60min.main;


import org.in60min.bean.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Example8 {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean("vehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

    }
}
