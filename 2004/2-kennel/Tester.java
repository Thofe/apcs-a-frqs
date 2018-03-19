
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Tester
{
    public static void main(){
        LoudDog loud = new LoudDog("Loud Boi");
        Dog dog = new Dog("Not Loud Boi");
        Cat cat = new Cat("Kat");
        
        ArrayList<Pet> petList = new ArrayList();
        petList.add(loud);
        petList.add(dog);
        petList.add(cat);
        
        Kennel kennel = new Kennel(petList);
        
        kennel.allSpeak();
    }
}
