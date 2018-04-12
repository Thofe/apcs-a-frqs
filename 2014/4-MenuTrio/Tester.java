
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        Sandwich sandwich =new Sandwich("Cheeseburger");
        Salad salad = new Salad("Coleslaw");
        Drink drink1 = new Drink("Cappuccion");
        Drink drink2 = new Drink("Orange Soda");
        
        MenuItem trio1 = new Trio(sandwich, salad, drink1);
        MenuItem trio2 = new Trio(sandwich, salad, drink2);
        
        System.out.println(trio1.getName() + " costs $" + trio1.getPrice());
        System.out.println(trio2.getName() + " costs $" + trio2.getPrice());
    }
}
