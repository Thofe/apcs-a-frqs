
/**
 * Write a description of class Advance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Advance extends Ticket
{
   private int days;
   
   /**
    * Constructs the Advance class
    * 
    * @param numDays the number of days in advance the tiket was purchased
    */
   public Advance(int numDays){
       days = numDays;
   }
   
   /**
    * Returns the price of the ticket
    * 
    * @return the price of the ticket
    */
   public double getPrice(){
       if (days<10) return 40;
       return 30;
   }
}
