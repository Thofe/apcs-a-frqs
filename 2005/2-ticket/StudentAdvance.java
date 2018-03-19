
/**
 * Write a description of class StudentAdvance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvance extends Advance
{
    private int days;
   
   /**
    * Constructs the StudentAdvance class
    * 
    * @param numDays the number of days in advance the tiket was purchased
    */
   public StudentAdvance(int numDays){
       super(numDays);
       student = true;
   }
   
   /**
    * Returns the price of the ticket
    * 
    * @return the price of the ticket
    */
   public double getPrice(){
       return super.getPrice()/2;
   }
}
