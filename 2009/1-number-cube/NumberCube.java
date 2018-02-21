
/**
 * Write a description of class NumberCube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class NumberCube
{
    private int high;
    private int low;
    
    /**
     * constructs a cube with individual side values
     * 
     * @param high the highest value on a cube
     * @param low the lowest value on a cube
     */
    public NumberCube(int high, int low){
        this.high = high;
        this.low = low;
    }
    
    /**
     * rolls a  cube
     * 
     * @return the value of the roll
     */
    public int toss(){
        Random random = new Random();
        
        int randomInt = random.nextInt(high) + low;
        return randomInt;
    }
}
