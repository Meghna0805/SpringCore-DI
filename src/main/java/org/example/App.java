package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Retrieve and use the Car bean
        Car car1 = context.getBean(Car.class);
        car1.drive();
    }
}
