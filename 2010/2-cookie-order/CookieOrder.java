
/**
 * Write a description of class CookieOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CookieOrder
{
    private String[] order = new String[2];
    
    /**
     * Constructs the CookieOrder class
     * 
     * @param variety the variery of the order
     * @param numBoxes the number of boxes in the order
     */
    public CookieOrder(String variety, int numBoxes){
        order[0] = variety;
        order[1] = Integer.toString(numBoxes);
    }
    
    /**
     * Returns the variety of the order
     * 
     * @return the variety of the order
     */
    public String getVariety(){
        return order[0];
    }
    
    /**
     * Returns the number of boxes in the order
     * 
     * @return the number of boxes in the order
     */
    public int getNumBoxes(){
        return Integer.parseInt(order[1]);
    }
}
