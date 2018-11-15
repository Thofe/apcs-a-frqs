import java.util.Arrays;
public class Tester {
	public static void main(String args[]) {
		int[][] arr = 	{	{10,30,20,0},
							{0,20,30,10},
							{30,0,10,20},
							{20,10,0,30}  };
		
		int[] arr1 = {10,30,20,0};
		
		int[] result = ArrayTester.getColumn(arr, 0);
		
		System.out.println("Get Column:      expected = [10, 0, 30, 20], actual = " + Arrays.toString(result));
		System.out.println("Contains Duplicates:      expected = false, actual = " + ArrayTester.containsDuplicates(arr1));
		System.out.println("Has all Values:      expected = true, actual = " + ArrayTester.hasAllValues(arr1, result));
		System.out.println("is Latin:      expected = true, actual = " + ArrayTester.isLatin(arr));
	}
}
