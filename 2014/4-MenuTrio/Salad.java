
/**
 * Write a description of class Salad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salad implements MenuItem
{
    private String type;
    
    /**
     * @param the type of sandwich
     */
    public Salad(String name){
        type = name;
    }

    public String getName(){
        return type;
    }
    
    public double getPrice(){
        return 1.25;
    }
}
