
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        int[] table = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
       
        BatteryCharger charger = new BatteryCharger(table);
        
        System.out.println("Optimum Start Time for 7 hours of charging:" + charger.getChargeStartTime(7));
        System.out.println("Optimum Start Time for 2 hours of charging:" + charger.getChargeStartTime(2));
    }
}
