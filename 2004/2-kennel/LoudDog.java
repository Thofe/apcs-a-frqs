
/**
 * Write a description of class LoudDog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
    /**
     * Constructs the LoudDog class (an extension of Dog class)
     * 
     * @param name the name to be assigned to the Dog  LoudDog
     */
    public LoudDog(String name)
    {
        super(name);
    }
    
    /**
     * Makes the LoudDog speak
     * 
     * @return the noise the Dog makes but twice
     */
    public String speak(){
        return super.speak() + " " + super.speak();
    }
}
