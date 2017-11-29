
/**
 * Write a description of class Sound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class Sound
{
    // instance variables - replace the example below with your own
    private int[] samples;
    
    /**
     * Constructs the samples array
     * 
     * @param samples (as an int[]) the array of sounds to be used
     */
    public Sound(int[] samples){
        this.samples = samples;
    }

    /**
     * Limits the amplitude of the set of sounds and returns the ammount of changes that were made to the array
     * 
     * @param limit (as an int) the maximum amplitude
     * 
     * @return ammount of changes to the array made
     */
    public int limitAmplitude(int limit){
        int count = 0;
        
        for(int i =0; i < samples.length; i ++){
            if (samples[i] > limit){
                samples[i]=limit;
                count++;
            }else if (samples[i] < (-1*limit)){
                samples[i] = (-1*limit);
                count++;
            }
        }
        
        return count;
    }
    
    /**
     * Removes bytes of no sound a the beginning of the song
     */
    public void trimSilenceFromBeginning(){
        boolean zerofront = true;
        int zerocount = 0;
        int i = 0;
        
        while (zerofront){
            if (samples[i] == 0){
                zerocount++;
                i++;
            }else{
                zerofront = false;
            }
        }
        
        int[] temparray = new int[samples.length - zerocount];
        
        for (int z=0; z<temparray.length; z++){
            temparray[z]= samples[z+zerocount];
        }
        
        samples = temparray;
    }
    
    /**
     * Prints the samples array
     */
    public String printSamples(){
        String tempstring = Arrays.toString(samples);
        
        
        return tempstring;
    }
}