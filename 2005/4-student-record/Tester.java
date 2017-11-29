
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    /**
     * Main function, run to calculate and print the scores of hardcoded sets
     */
    public static void main(){
        int a[]= {50, 50, 20, 80, 53};
        int b[]= {20,50, 50, 53, 80};
        int c[]= {20, 50, 50, 80};
        
        StudentRecord scores1 = new StudentRecord(a);
        StudentRecord scores2 = new StudentRecord(b);
        StudentRecord scores3 = new StudentRecord(c);
        
        System.out.println(scores1.finalAverage());
        System.out.println(scores2.finalAverage());
        System.out.println(scores3.finalAverage());
    }
}
