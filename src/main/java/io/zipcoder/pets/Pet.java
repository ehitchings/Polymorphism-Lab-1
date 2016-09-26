package io.zipcoder.pets;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class Pet {
    private String name;


    public Pet(String name) {
        this.name = name;
    }

    public Pet(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "I have no mouth yet I must scream";
    }

    public String toString(){
        return "My name is " + this.getName() + " and I say " + this.speak();
    }


}
