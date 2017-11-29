
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;


public class Tester
{
    /**
     * The main tester function
     */
    public static void main(){
        College colgate = new College("Colgate University", "Northeast", 27025);
        College duke = new College("Duke University", "Southeast", 26000);
        College kalamazoo = new College("Kalamazoo College", "Midwest", 19764);
        College stanford = new College("Stanford University", "Midwest", 25917);
        College flordia = new College("Flordia International University", "Southeast", 10800);
        College dartmouth = new College("Dartmouth College", "Northeast", 27764);
        College spelman = new College("Spelman College", "Southeast", 11455);
        
        College a[] = {colgate, duke, kalamazoo, stanford, flordia, dartmouth, spelman};
        
        CollegeGroup test = new CollegeGroup(a);
        
        test.updateTuition("Colgate University", 27500);
        System.out.println(colgate.getTuition());
        
        College b[] = test.getCollegeList("Southeast", 10000, 20000);
        
        for (int i =0; i < b.length; i++){
            System.out.println(b[i].getName());
            System.out.println(b[i].getRegion());
            System.out.println(b[i].getTuition());
            System.out.println();
        }
    }   
}
