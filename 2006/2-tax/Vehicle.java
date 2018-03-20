
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends TaxableItem
{
    private int price;
    private int markup;
    
    /**
     * retuns the list price of the car
     * 
     * @param price the price of the car
     * @param markup the dealer markup on the car
     * 
     * @return the list price of the car
     */
    public double getListPrice(){
        return price + markup;
    }
    
    /**
     * Constructs the Vehicle class
     */
    public Vehicle(int price, int markup, double rate){
        super(rate);
        this.price = price;
        this.markup = markup;
    }
    
    /**
     * Changes the dealer makup
     * 
     * @param newMarkup the new markup of the car
     */
    public void changeMarkup(int newMarkup){
        this.markup = newMarkup;
    }
}
