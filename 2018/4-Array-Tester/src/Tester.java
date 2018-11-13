import java.util.Arrays;
public class Tester {
	public static void main(String args[]) {
		int[][] arr = 	{	{10,30,20,0},
							{0,20,30,10},
							{30,0,10,20},
							{20,10,0,30}  };
		
		int[] arr1 = {10,30,20,0};
		
		int[] result = ArrayTester.getColumn(arr, 0);
		
		//System.out.println("Get Column:      expected = [10, 0, 30, 20], actual = " + Arrays.toString(result));
		//System.out.println("Contains Duplicates:      expected = false, actual = " + ArrayTester.containsDuplicates(arr1));
		//System.out.println("Has all Values:      expected = true, actual = " + ArrayTester.hasAllValues(arr1, result));
		//System.out.println("is Latin:      expected = true, actual = " + ArrayTester.isLatin(arr));
		
		boolean condition1 = ArrayTester.containsDuplicates(arr[0]);
		boolean condition2a = ArrayTester.hasAllValues(arr[0], arr[1]);
		boolean condition2b = ArrayTester.hasAllValues(arr[0], arr[2]);
		boolean condition2c = ArrayTester.hasAllValues(arr[0], arr[3]);
		boolean condition3a = ArrayTester.hasAllValues(arr[0], ArrayTester.getColumn(arr, 0));
		boolean condition3r = ArrayTester.hasAllValues(arr[0], result);
		boolean condition3b = ArrayTester.hasAllValues(arr[0], ArrayTester.getColumn(arr, 1));
		boolean condition3c = ArrayTester.hasAllValues(arr[0], ArrayTester.getColumn(arr, 2));
		boolean condition3d = ArrayTester.hasAllValues(arr[0], ArrayTester.getColumn(arr, 3));
		
		System.out.println("Condition 1:  expected = false,  actual = " + condition1);
		System.out.println("Condition 2a: expected = true,   actual = " + condition2a);
		System.out.println("Condition 2b: expected = true,   actual = " + condition2b);
		System.out.println("Condition 2c: expected = true,   actual = " + condition2c);
		System.out.println("Condition 3a: expected = true,   actual = " + condition3a);
		System.out.println("Condition 3a but with result instead of ArrayTester.getColumn(arr, 0): expected = true,   actual = " + condition3r);
		System.out.println("Condition 3b: expected = true,   actual = " + condition3b);
		System.out.println("Condition 3c: expected = true,   actual = " + condition3c);
		System.out.println("Condition 3d: expected = true,   actual = " + condition3d);
	}
}
