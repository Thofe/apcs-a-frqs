
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Pet
{
    private String myName;
    
    /**
     * Constructs a pet
     * 
     * @param name the name of the pet
     */
    public Pet(String name){
        myName = name;
    }
    
    /**
     * Returns the name of the pet
     * 
     * @return the name of a given pet
     */
    public String getName(){
        return myName;
    }
    
    /**
     * Tells the given pet to execute its speak function
     */
    public abstract String speak();
}
