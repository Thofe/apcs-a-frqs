
/**
 * Write a description of class actualCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecord
{
    private int[] scores;
    
    /**
     * Constructs the score array 
     * 
     * @param scores (as an int[]) the array of scores to be used
     */
    public StudentRecord(int[] scores){
        this.scores = scores;
    }
    
    /**
     * Averages a set of scores between two given values
     * 
     * @param first (as an int) the value at which you start evaluating the average
     * @param last (as an int) the value at which you stop evaluating the average
     * 
     * @return (as a double) the average score of the given section
     */
    private double average(int first, int last){
        int counter = last-first +1;
        double sum = 0.0;
        
        for (int  i = first; i<=last; i++){
            sum += scores[i];
        }
        
        return sum/counter;
    }
    
    /**
     * Checks to see if the score has improved over time
     * 
     * @return (as a boolean) if the the score have improved over time
     */
    private boolean hasImproved(){
        for (int i=0; i<scores.length; i++){
            if (i != 0 && scores[i]<scores[i-1]){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Calculated the final average based on a set of scores
     * 
     * @return (as an double) the final average of a set of scores
     */
    public double finalAverage(){
        if (hasImproved()){
            return average(scores.length/2, scores.length-1);
        }else{
            return average(0, scores.length-1);
        }
    }
}
