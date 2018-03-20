
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        Vehicle car = new Vehicle(20000, 2500, 0.10);
        System.out.println(car.purchasePrice());
        car.changeMarkup(1000);
        System.out.println(car.purchasePrice());    
    }
}
