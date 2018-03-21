
/**
 * Write a description of class TaxableItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class TaxableItem implements Item
{
    private double taxRate;
    
     /**
     * Constructs the TaxableItem task
     *
     * @param rate the tax rate of the item
     */
    public TaxableItem(double rate){
        taxRate = rate;
    }
    
    /**
     * returns the list price
     */
    public abstract double getListPrice();
    
    /**
     * returns the price of the item including the tax
     * 
     * @return the price of the item including the tax
     */
    public double purchasePrice(){
        return (this.getListPrice()) + (this.getListPrice()*taxRate);
    }
}
