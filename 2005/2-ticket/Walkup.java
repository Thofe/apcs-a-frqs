
/**
 * Write a description of class Walkup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Walkup extends Ticket
{
   private int price;
   
    /**
    * Constructs the Walkup class
    */
   public Walkup(){
       price = 50;
   }
   
   /**
    * Returns the price of the ticket
    * 
    * @return the price of the ticket
    */
   public double getPrice(){
       return price;
   }
}
