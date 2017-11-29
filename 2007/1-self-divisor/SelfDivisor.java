
/**
 * Write a description of class SelfDivisor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class SelfDivisor
{
    /**
     * Returns whether or not a given number is a self divisor
     * 
     * @param number (as an int) the number that will be checked
     * 
     * @return whether or not the give number is a self divisor
     */
    public static boolean isSelfDivisor(int number){
        int tempnumber = number;
        
        while (tempnumber>0){
            if (tempnumber % 10 == 0 || number%(tempnumber%10) != 0){
                return false;
            }
            tempnumber = tempnumber/10;
        }
        
        return true;
    }
    
    /**
     * Returns a given number of self divisors greater than or equal to a given number
     * 
     * @param start (as an int) the number that the self divisors must be greater than or equal to
     * @param num (as an int) the number of self divisors after the starting number
     * 
     * @return an array containing the set number of self divisors that are greater than or equal to the given starting number
     */
    public static int[] firstNumSelfDivisors(int start, int num){
        int[] temparray = new int[num];
        int number = start;
        int count = 0;
        
        while (count < num){
            if (isSelfDivisor(number)){
                temparray[count] = number;
                count ++;
            }
            number ++;
        }
        
        return temparray;
    }
    
    /**
     * Runs the isSelfDivisor function and the firstNumSelfDivisors function and prints their output.
     */
    public static void main(){
        System.out.println(isSelfDivisor(128));
        System.out.println(isSelfDivisor(26));
        System.out.println();
        String testarray = Arrays.toString(firstNumSelfDivisors(10, 3));
        System.out.println(testarray);
    }
}
