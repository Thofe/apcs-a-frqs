
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    // instance variables - replace the example below with your own
    /**
     * Main function, run to either limit amplitude or trim 0's
     */
    public static void main(){
        int[] a = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        
        Trail markerset = new Trail(a);
        
        System.out.println(markerset.isLevelTrailSegment(2, 12));
        System.out.println(markerset.isDifficult());
    }
}
