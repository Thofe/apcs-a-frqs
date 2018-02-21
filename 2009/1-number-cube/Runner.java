
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    /**
     * Returns an array of values obtained by tossing a cube numTosses times
     * 
     * @param cube a NumberCube
     * @param numTosses the number of tosses to be recorded
     * @returns an array of the results
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        int[] results = new int[numTosses];
        
        for(int i =0; i<results.length; i++){
            results[i] = cube.toss();
        }
        
        return results;
    }
    
    /**
     * Returns the starting index of a longest run of 2 or more consecutive related values in the array values
     * 
     * @param values an array of intergers representing a series of cube tosses
     * 
     * @return the starting index of the longest run
     */
    public static int getLongestRun(int[] values){
        int runStart = 0;
        int runLength =0;
        
        for (int i=0; i<values.length; i++){
            int currentRunStart = i;
            int currentRunLength = 1;
            
            int j= i+1;
            
            while (j<values.length && values[i] == values[j]){
                currentRunLength++;
                j++;
            }
            
            if (currentRunLength > runLength){
                runLength = currentRunLength;
                runStart = currentRunStart;
            }
        }
        
        if(runLength ==0){
            return -1;
        }
        return runStart;
    }
    
    public static void main(){
        NumberCube cube = new NumberCube(6,1);
        
        int[] values = getCubeTosses(cube, 20);
        
        System.out.println("List of results");
        for (int v: values ){
            System.out.print(v + ", ");
        }
        System.out.println();
        
        System.out.println("Longest Run Start");
        System.out.println(getLongestRun(values));
    }
}
