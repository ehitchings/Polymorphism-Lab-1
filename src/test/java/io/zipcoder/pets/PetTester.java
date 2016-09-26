package io.zipcoder.pets;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class PetTester {


    Pet pet1 = new Dog("TooTall");
    Pet pet2 = new Cat("Stink");
    Pet pet3 = new Rat("Floyd");
    Pet pet4 = new Rat("Demona");
    List<Pet> petList = new ArrayList<Pet>();

    @Before
    public void setup() {
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        petList.add(pet4);
    }


    @Test
    public void dogSpeakTest() {
        assertEquals("The dog did not bark", "BARK!", petList.get(0).speak());

    }

    @Test
    public void catSpeakTest() {
        assertEquals("The cat did not meow", "MEOW!", petList.get(1).speak());
    }

    @Test
    public void ratSpeakTest() {
        assertEquals("The rat did not *squeak*", "*squeak*", petList.get(2).speak());
    }


}