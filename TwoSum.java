package Main;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		// Two Sum, there will be an array as input and the sum result
		int[] inputArray = new int[] {1, 2, 3, 4};
		int target = 7;
		int[] resultArray = twoSumIndexes(inputArray, target);
		
		System.out.println("Result indexes:" + resultArray[0] + "-" + resultArray[1] + "" + Arrays.toString(inputArray) + Arrays.toString(resultArray));
	}
	
	public static int[] twoSumIndexes(int[] inputArray, int target) {
		
		int[] resultIndexes = new int[inputArray.length];
		
		for (int index = 0; index < inputArray.length; index++) {
			for (int innerIndex = index + 1; innerIndex < inputArray.length; innerIndex++) {
				int sum = inputArray[index] + inputArray[innerIndex];
				if (sum == target) {
					resultIndexes[0] = index;
					resultIndexes[1] = innerIndex;
				}
			}
		}
		
		return resultIndexes;
	}

}