
/**
 * Write a description of class MasterOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class MasterOrder
{
    private ArrayList<CookieOrder> orders;
    
    public MasterOrder(){
        orders = new ArrayList<CookieOrder>();
    }
    
    /**
     * Adds theOrder to the master order
     * 
     * @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder){
        orders.add(theOrder);
    }
    
    /**
     * Returns the sum of all the boxes in the master order
     * 
     * @return the sum of the number of boxes of all the cookie orders
     */
    public int getTotalBoxes(){
        int boxCount=0;
        
        for (CookieOrder c: orders){
            boxCount += c.getNumBoxes();
        }
        
        return boxCount;
    }
    
    /**
     * Removes all cookie orders from the master order that are of a given variety
     * 
     * @param cookieVar the variety of cookies to be removed
     * @return the number of boxes that were removed
     */
    public int removeVariety(String cookieVar){
        int removedCount =0;
        
        for (int i = orders.size() -1; i >=0; i --){
            CookieOrder currentOrder = orders.get(i);
            
            if (currentOrder.getVariety().equals(cookieVar)){
                removedCount += currentOrder.getNumBoxes();
                orders.remove(i);
            }
            
        }
        
        return removedCount;
    }
}
