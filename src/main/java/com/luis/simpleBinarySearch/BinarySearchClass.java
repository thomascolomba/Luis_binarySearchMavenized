package com.luis.simpleBinarySearch;

import java.util.Arrays;

public class BinarySearchClass {

	int left = 0;
	int right = 0;
	int middle = 0;
	int position = 0;
	int number = 0;
	boolean found = false;

	public boolean binarySearch(int m[], int x) {
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		int left = 0;
		right = m.length - 1;
		while (left <= right && !(found)) {
			middle = left + ((right - left) / 2);
			if (m[middle] == x) {
				found = true;
				System.out.println("The number " + x + " has been found in the position " + middle + "");
			} else if (x < m[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}

		if (found)
			return true;
		else
			return false;

	}
}
