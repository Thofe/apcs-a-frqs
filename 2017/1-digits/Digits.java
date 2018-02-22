
/**
 * Write a description of class Digits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.lang.Integer;

public class Digits
{
    private ArrayList<Integer> digitList;
    
    /**
     * constricts s Digits object that represents num
     * 
     * @param num the number to be represented
     */
    public Digits(int num){
        ArrayList<Integer> broken = new ArrayList<Integer>();
        
        while (num >=10){
            int part = num%10;
            broken.add(0, part);
            num = num/10;
        }
        
        broken.add(0, num%10);
        digitList = broken;
    }
    
    /**
     * returns true if the digits in this Digits object are in strictly increasing order and false if otherwise
     * 
     * @return boolean if the digits are increasing
     */
    public boolean isStrictlyIncreasing(){
        int previous = Integer.MIN_VALUE;
        
        for(int c: digitList){
            if(previous >=c){
                return false;
            }
            
            previous = c;
        }
        
        return true;
    }
    
    /**
     * prints the digitList in the form of a string
     */
    public void stringForm(){
        for (int d: digitList){
            System.out.print(d + " ");
        }
    }
}
