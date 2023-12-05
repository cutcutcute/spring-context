package org.example2;

public class Person {

    private String name;
    private Parrot parrot;


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

    @Override
    public String toString(){
        return "Person name - " + this.name + "\n" + "Parrot name - " + this.parrot.getName();

    }

}
