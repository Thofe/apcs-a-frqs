
/**
 * Write a description of class Kennel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Kennel
{
    private ArrayList<Pet> petList;
    
    /**
     * Constructs a kennel
     * 
     * @param petList the list of all the pets inside the kennel
     */
    public Kennel(ArrayList<Pet> petList){
        this.petList = petList;
    }
    
    /**
     * Makes all the pets speak
     */
    public void allSpeak(){
        for (Pet p: petList){
            System.out.println(p.getName() + ": " + p.speak()); 
        }
    }
}
