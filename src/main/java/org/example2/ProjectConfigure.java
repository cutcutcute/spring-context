package org.example2;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigure {

    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Gleb");
        return p;
    }


    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Bob");
        return p;
    }

    @Bean
    public Person person (@Qualifier("parrot2") Parrot parrot){
        Person person = new Person();
        person.setName("Evgeniy");
        person.setParrot(parrot);
        return person;
    }

}
