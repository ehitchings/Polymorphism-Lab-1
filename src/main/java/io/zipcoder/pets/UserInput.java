package io.zipcoder.pets;
import java.util.*;
import io.zipcoder.pets.*;


/**
 * Created by evanhitchings on 9/26/16.
 */
public class UserInput {
    public Scanner reader;
    private PetOwner currentUser;



    public UserInput(){
        this.reader = new Scanner(System.in);
    }

    public void run(PetOwner po){
        this.currentUser = po;
        currentUser.setNumberOfPets(numberOfPets());
        petTypes(currentUser.getNumberOfPets());




    }

    public int numberOfPets(){
        System.out.println("How many pets?");
        int number = Integer.parseInt(reader.nextLine());
        return number;

    }

    public void petTypes(int pets){
        for(int i = 1; i <= pets; i++){
            String petInfo = "";
            System.out.println("Pet " + i + ": Type of pet?");
            petInfo = petInfo + reader.nextLine() + ":\t";
            System.out.println("Name?");
            petInfo = petInfo + reader.nextLine();
            currentUser.getPets().add(petInfo);
        }

    }



}
