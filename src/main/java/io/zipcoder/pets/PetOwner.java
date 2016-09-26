package io.zipcoder.pets;
import java.util.*;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class PetOwner {
    private int numberOfPets;
    private List<String> pets;

    public PetOwner() {
        this.pets = new ArrayList<String>();
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public List<String> getPets() {
        return pets;
    }
}
