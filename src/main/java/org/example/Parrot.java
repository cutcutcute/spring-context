package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class Parrot {

    private String name = "Koko";

    public String getName(){
        return name;
    }

    public void setName(String otherName){
        this.name = otherName;
    }

    @Override
    public String toString(){
        return "Parrot " + this.name;
    }

}
