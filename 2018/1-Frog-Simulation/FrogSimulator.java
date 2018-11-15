public class FrogSimulator{
    /** Distance from starting point to goal in inches**/
    private int goalDistance;
    
    /** Maimum number of hops to get to the goal **/
    private int maxHops;
    
    /** constructs a FrogSimulaton where dist is the distance, in inches, from the starting position to the goal, and numHops
     * is the maximum number of hops allowed to reach the goal.
     * PRECONDITION: dist >0; numhops>0;
     * 
     * @param dist the distance, in inches, from the starting position to the goal
     * @param numHops the maximum number of hops allowed to reach the goal
     */
    public FrogSimulator(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
    
    /**Returns an interger representing the distance, in inches, to be moved when the frog hops
     * 
     * @return the distance the frog hops
     */
    public int hopDistance(){
        return (int)(Math.random() * ((10 - (0-10)) + 1)) + (0-10);
    }
    
    /** Simulates a frog attempting to reach the goal as described in part (a)
     * 
     * @return true if the frog is successfully reached or passed the goal during the simulation; false otherwise
     */
    public boolean simulate(){
        int covered = 0;
        
        for(int i =0; i < maxHops; i++){
            covered += hopDistance();
        }
        
        return covered >= goalDistance;
    }
    
    /** runs num simulations and returns the proportion of simulations in which the frog successfully reached or passed the goal
     * 
     * @param num the number of simulations to be run
     * @return the proportion of simulations in which the frog successfully reached or passed the goal
     */
    public double runSimulations(int num){
        double success = 0;
        
        for(int i =0; i< num; i++){
            if(simulate()) success++;
        }
        
        return success/num;
    }
}