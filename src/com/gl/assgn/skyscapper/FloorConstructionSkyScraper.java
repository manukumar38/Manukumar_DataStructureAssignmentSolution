package com.gl.assgn.skyscapper;

import java.util.Collections;
import java.util.Stack;

public class FloorConstructionSkyScraper {
	//Max value as static variable 
	static int max;
	Stack<Integer> stack = new Stack<Integer>();

	// Method to arrange the largest floor size
	// then next largest floor based on user input floor size
	public void sortList(int floorSize, int floorArray[]) {
		// Assigning the maximum floor size value to max
		max = floorSize;
		// loop to check every floor value with the max, once max found
		// then next max value to be checked in the stack
		System.out.println("The order of construction is as follows");
		for (int i = 0; i < floorArray.length; i++) {
			System.out.println("Day " + (i + 1));
			// If max value is found in the array then print it and reduce the max value
			// else push the array value to stack

			if (floorArray[i] == max) {
				System.out.println(floorArray[i]);
				max--;
				// Till the stack is not empty, check if next max value is found in stack and
				// continue checking next max values else break the loop
				while (!stack.isEmpty()) {
					int x = stack.peek();
					if (x == max) {
						System.out.println(stack.pop());
						max--;
						continue;
					} else {
						break;
					}

				}
			}
			// If its not maximum value then push the value in to the stack
			else {
				stack.push(floorArray[i]);
				System.out.println(" ");
			}
		}
		// Remaining floors that needs to be printed at the end
		if (!stack.isEmpty()) {
			Collections.sort(stack, Collections.reverseOrder());
			Object[] arr = stack.toArray();
			for (int j = 0; j < arr.length; j++)
				System.out.println(arr[j]);
		}

	}
}
