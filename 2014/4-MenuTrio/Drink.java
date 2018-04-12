
/**
 * Write a description of class Drink here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drink implements MenuItem
{
    private String type;
    
    /**
     * @param the type of sandwich
     */
    public Drink(String name){
        type = name;
    }
    
    public String getName(){
        return type;
    }
    
    public double getPrice(){
        if (type.equals("Orange Soda")){
            return 1.25;
        }
        return 3.5;
    }
}
