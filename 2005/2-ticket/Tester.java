
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        Walkup walk = new Walkup();
        Advance twelveDays = new Advance(12);
        Advance threeDays = new Advance(3);
        StudentAdvance studentTwelveDays = new StudentAdvance(12);
        StudentAdvance studentThreeDays = new StudentAdvance(3);
        
        System.out.println(walk.toString());
        System.out.println(twelveDays.toString());
        System.out.println(threeDays.toString());
        System.out.println(studentTwelveDays.toString());
        System.out.println(studentThreeDays.toString());
    }
}
