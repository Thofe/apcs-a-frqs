
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        FrogSimulator frog1 = new FrogSimulator(5,5);
        
        System.out.println(frog1.simulate());
        System.out.println(frog1.simulate());
        System.out.println(frog1.simulate());
        System.out.println(frog1.simulate());
        System.out.println(frog1.simulate());
        System.out.println(frog1.simulate());
        
        System.out.println(frog1.runSimulations(10));
        System.out.println(frog1.runSimulations(10));
        System.out.println(frog1.runSimulations(10));
    }
}
