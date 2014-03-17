// Nicholas Romanoff
// Period One
// Homework #07 QuickSort
// 2014-03-11

import java.util.*;

public class QuickSort {

	// quickSort function of logn runtime
	public static Integer[] quickSort(Integer[] a) {
		// basecase
		if (a.length <= 1) {
			return a;
		}
		else {
			// selects pivot randomly from with a
			Random random = new Random();
			Integer pivotInt = a[random.nextInt(a.length)];
			// partitions the list into lower and upper halves
			ArrayList<Integer> lower = new ArrayList();
			ArrayList<Integer> pivot = new ArrayList();
			ArrayList<Integer> higher = new ArrayList();
			for (Integer x: a) {
				if (x < pivotInt) {
					lower.add(x);
				}
				else if (x > pivotInt) {
					higher.add(x);
				}
				else {
					pivot.add(x);
				}
			}
			// changes those arraylists back into arrays
			Integer[] lowArray = lower.toArray(new Integer[lower.size()]);
			Integer[] highArray = higher.toArray(new Integer[higher.size()]);
			Integer[] pivotArray = pivot.toArray(new Integer[pivot.size()]);
			// runs the method recursively on each of those halves
			Integer[] r1 = quickSort(lowArray);					
			Integer[] r2 = quickSort(highArray);
			// merges the halves and returns
			return merge(r1, pivotArray, r2);
		}
	}

	// helper function for merging arrays
	public static Integer[] merge(Integer[] low, Integer[] pivot, Integer[] high) {
		Integer[] merged = new Integer[low.length + pivot.length + high.length];
		int index = 0;
		for (int x : low) {
			merged[index] = x;
			index++;
		}
		for (int x : pivot) {
			merged[index] = x;
			index++;
		}
		for (int x : high) {
			merged[index] = x;
			index++;
		}	
		return merged;
	}

	// helper function for print arrays of Integers
	public void printArray(Integer[] a) { 
		String printStr = "[";
        	for (Integer n : a) {
			printStr += " " + n;
		}
		System.out.println(printStr += " ]");
	}

	// driver helper function for testing quickSort
	public Integer[] randomArray() {
		Integer[] array = new Integer[(int)(Math.random() * 20) + 5];
		for (int x = 0; x < array.length; x++) {
			array[x] = (int)(Math.random() * 100);
		}
		return array;
	}

	// driver for testing
	public static void main(String[] args) {

		QuickSort quicky = new QuickSort();
		System.out.println("\nTesting QuickSort...");
		for (int x = 0; x < 10; x++) {
			Integer[] r = quicky.randomArray();
			System.out.println("\nBefore QuickSort:");
			quicky.printArray(r);
			System.out.println("After QuickSort:");
			quicky.printArray(quickSort(r));
		System.out.println();
		}
	}
}
