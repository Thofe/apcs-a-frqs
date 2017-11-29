
/**
 * Write a description of class Trail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trail
{
    // instance variables - replace the example below with your own
    private int[] markers;
    
    /**
     * Constructor for the markers array
     * 
     * @param markers (as an int[]) the array of trail segment height elevation markers
     */
    public Trail(int[] markers){
        this.markers = markers;
    }
    
    /**
     * Checks to see if the trail is level 
     * 
     * @param start (as an int) the starting trail marker index
     * @param end (as an int) the ending trail marker index
     * 
     * @return if the trail is flat or not
     */
    public boolean isLevelTrailSegment(int start, int end){
        int max = markers[start];
        int min = markers[start];
        
        for (int i=start; i<=end; i ++){
            if (markers[i] < min){
                min = markers[i];
            }else if (markers[i]> max){
                max = markers[i];
            }
        }
        
        return (10 > (Math.abs(max-min)));
    }
    
    /**
     * Checks to see if the trail is considerd difficult
     * 
     * @return if the trail is difficult or not
     */
    public boolean isDifficult(){
        int count = 0;
        
        for (int i = 1; i < markers.length; i++){
            if (Math.abs(markers[i-1] - markers[i]) >= 30){
                count ++;
            }
        }
        
        return (count >= 3);
    }
}
