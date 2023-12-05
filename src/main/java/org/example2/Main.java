package org.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfigure.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);



    }
}
