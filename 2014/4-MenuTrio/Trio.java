
/**
 * Write a description of class Trio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    
    /**
     * Constructs a trio meal
     * 
     * @param san the sandwich in the trio
     * @param sal the salad in the trio
     * @param dri the drink in the trio
     */
    public Trio(Sandwich san, Salad sal, Drink dri){
        this.sandwich = san;
        this.salad = sal;
        this.drink = dri;
    }
    
    public String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }
    
    public double getPrice(){
        double sandPrice = sandwich.getPrice();
        double salPrice = salad.getPrice();
        double driPrice = drink.getPrice();
        
        double lowest = Math.min(sandPrice, Math.min(salPrice, driPrice));
        double total = sandPrice + salPrice + driPrice;
        
        return total - lowest;
    }
}
