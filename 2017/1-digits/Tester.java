
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        Digits d1 = new Digits(15704);
        
        d1.stringForm();
        
        
        System.out.println();
        
        
        Digits d2 = new Digits(7);
        
        System.out.println(d2.isStrictlyIncreasing());
        
        
        Digits d3 = new Digits(1356);
        
        System.out.println(d3.isStrictlyIncreasing());
        
        
        Digits d4 = new Digits(1336);
        
        System.out.println(d4.isStrictlyIncreasing());
    }
}
