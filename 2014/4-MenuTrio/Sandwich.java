
/**
 * Write a description of class Sandwich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sandwich implements MenuItem
{
    private String type;
    
    /**
     * @param the type of sandwich
     */
    public Sandwich(String name){
        type = name;
    }
    
    public String getName(){
        return type;
    }

    public double getPrice(){
        return 2.75;
    }
    
}
