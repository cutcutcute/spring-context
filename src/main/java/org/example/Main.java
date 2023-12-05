package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        Parrot parrot = context.getBean(Parrot.class);


        System.out.println("Person name " + person.getName());

        System.out.println("Person parrot " + person.getParrot());

        System.out.println("Parrot name " + parrot.getName());




    }
}