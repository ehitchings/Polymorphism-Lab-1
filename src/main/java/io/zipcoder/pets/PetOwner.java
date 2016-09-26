package io.zipcoder.pets;
import java.util.*;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class PetOwner {
    private int numberOfPets;
    private List<Pet> pets;

    public PetOwner() {
        this.pets = new ArrayList<Pet>();
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void petCreator(String type, String name){
        type = type.toLowerCase();
        switch(type){
            case "cat":
                this.pets.add(new Cat(name));
                break;
            case "dog":
                this.pets.add(new Dog(name));
                break;
            case "rat":
                this.pets.add(new Rat(name));
                break;
            default:
                this.pets.add(new Rat(name));
                break;

        }
    }
}
