import java.util.Arrays;
import java.util.*;
public class ArrayTester {
	/**Returns an array containing the elements of column c of arr2D in the same order they appear
	 * 
	 * @param arr2D array to be used
	 * @param c column number 
	 * @return an array containing the elements of column c of arr2D
	 */
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] returnable = new int[arr2D.length];
		
		for(int i =0; i<arr2D.length; i++) {
			returnable[i] = arr2D[i][c];
		}
		
		return returnable;
	}
	
	/**Returns true if and only if every value in arr1 appears in arr2
	 * 
	 * @param arr1 array used for checking
	 * @param arr2 array to be checked
	 * @return if every value in arr1 appears in arr2
	 */
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		
      for(int i: arr1){
      	boolean has = false;
        
        for(int j: arr2){
          if (j == i) has = true;
        }
        
        if(!has) return false;
      }
		  
		return true;
	}
	
	/**Returns true if arr contains any duplicate values
	 * 
	 * @param arr the array to be checked
	 * @return whether or not arr contains duplicate values
	 */
	public static boolean containsDuplicates(int[] arr) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i:arr) {
			if(!map.containsKey(i)) {
				map.put(i, true);
			}else {
				return true;
			}
		}
		
		return false;
	}
	
	/**Returns true if square is a Latin square
	 * 			Latin square is a square that fits all the following conditions
	 * 					1) The first row has no duplicate values
	 * 					2) All values in the first row of the square appear in each row of the square
	 * 					3) All values in the first row of the square appear in each column of the square
	 * 
	 * @param square the 2D array to be checked for Latinity
	 * @return if square is Latin or not
	 */
	public static boolean isLatin(int[][] square) {
		if (containsDuplicates(square[0])) {
			return false;
		}
		
		for(int i=1; i < square.length; i++){
			if(!hasAllValues(square[0], square[i])) {
				return false;
			}
		}
		
		for(int i=0; i< square[0].length; i++) {
			int[] result = getColumn(square, i);
			if(!hasAllValues(square[0], result)) {
				return false;
			}
		}
		
		return true;
	}
}
