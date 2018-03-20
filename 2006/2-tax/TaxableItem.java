
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
     * returns the list price
     */
    public abstract double getListPrice();
    
    /**
     * Constructs the TaxableItem task
     */
    public TaxableItem(double rate){
        taxRate = rate;
    }
    
    /**
     * returns the price of the item including the tax
     * 
     * @return the price of the item including the tax
     */
    public double purchasePrice(){
        return (this.getListPrice()) + (this.getListPrice()*taxRate);
    }
}
