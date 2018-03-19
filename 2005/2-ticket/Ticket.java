
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public abstract class Ticket
{
    private int serialNumber;
    public boolean student; 
    
    /**
     * Constructs the Ticket class
     */
    public Ticket(){
        serialNumber = getNextSerialNumber();
    }
    
    /**
     * Returns the price for this ticket
     */
    public abstract double getPrice();
    
    /**
     * Returns a strign with information about the ticket
     */
    public String toString(){
        if (student) return "Number: " + serialNumber + "\nPrice: " + getPrice() + "\n(student ID required)";
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
    
    /**
     * returns a new unique serial number
     */
    private static int getNextSerialNumber(){
        long unixTime = System.currentTimeMillis() / 1000L;
        int randomNum = 1 + (int)(Math.random() * ((100 - 1) + 1));
        
        return (int) unixTime/randomNum;
    }
}
