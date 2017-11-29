
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    /**
     * Main function, run to either limit amplitude or trim 0's
     */
    public static void main(){
        int[] a ={40, 2532, 17 , -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        int[] b ={0, 0, 0, 0, -14, 0, -35, -39, 0 ,-7, 16, 32, 37, 29, 0 ,0};
        
        Sound soundset1 = new Sound(a);
                
        System.out.println(soundset1.limitAmplitude(2000));
        System.out.println(soundset1.printSamples());
        
        
        Sound soundset2 = new Sound(b);
        
        soundset2.trimSilenceFromBeginning();
        System.out.println(soundset2.printSamples());
    }
}
