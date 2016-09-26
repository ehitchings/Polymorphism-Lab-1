package io.zipcoder.pets;
import java.util.*;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class PolymorphismLab1 {
    public static void main(String[] args) {
        PetOwner po = new PetOwner();
        UserInput ui = new UserInput();
        ui.run(po);
        System.out.println(po.getPets());




    }
}
