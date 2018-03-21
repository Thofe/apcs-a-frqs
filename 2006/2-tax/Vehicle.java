
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
     * Constructs the Vehicle class
     *
     * @param price the price of the vehicle
     * @param markup the dealer markup
     * @param rate the tax rate on the car
     */
    public Vehicle(int price, int markup, double rate){
        super(rate);
        this.price = price;
        this.markup = markup;
    }
    
    /**
     * retuns the list price of the car
     *
     * @return the list price of the car
     */
    public double getListPrice(){
        return price + markup;
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
