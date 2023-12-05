package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private Parrot parrot;

    @Autowired
    public Person(Parrot parrot){
        this.parrot = parrot;
    }



    public String getName(){
        return this.name;
    }

    public Parrot getParrot(){
        return this.parrot;
    }


    public void setName(String otherName){
        this.name = otherName;
    }

    public void setParrot(Parrot otherParrot){
        this.parrot = otherParrot;
    }

}
