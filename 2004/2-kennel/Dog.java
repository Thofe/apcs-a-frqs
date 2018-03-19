
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    /**
     * Constructs the Dog class (an extension of Pet class)
     * 
     * @param name the name to be assigned to the Pet Dog
     */
    public Dog(String name){
        super(name);
    }
    
    /**
     * Makes the Dog speak
     * 
     * @return the noise the Dog makes
     */
    public String speak(){
        return "bark";
    }
    
}
