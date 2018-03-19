
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    /**
     * Constructs the Cat class (an extension of Pet class)
     * 
     * @param name the name to be assigned to the Pet Cat
     */
    public Cat(String name){
        super(name);
    }
    
    /**
     * Makes the Cat speak
     * 
     * @return the noise the Cat makes
     */
    public String speak(){
        return "meow";
    }
}
