// Nicholas Romanoff
// Period One
// Homework #07 QuickSort
// 2014-03-11

import java.util.*;

// not functioning properly

public class QuickSort2 {

	// quickSort function of logn runtime
	public static void quickSort2(int[] a) {
		quickSort2(a, 0, a.length - 1);
	}

	// quickSort2 helper function - recursive component
	public static void quickSort2(int[] a, int left, int right) {
		if (right > left) {
			int partition = partition(a, left, right);
			quickSort2(a, partition + 1, right);
			quickSort2(a, left, partition - 1);
		}
	}

	// partition helper function for quickSort
	public static int partition(int[] a, int left, int right) {

		Random random = new Random();
	
		int leftWall = left;

		int pivot = random.nextInt(right - left) + left;
		swap(a, pivot, right);

		for (int index = left; index <= right - 1; index++) {
			if (a[index] < a[pivot]) {
				swap(a, index, leftWall);
				leftWall++;
			}
		}

		a[right] = a[leftWall];
		a[leftWall] = a[pivot];
		int rightWall = leftWall;

		for (int index = leftWall; index < right; index++) {
			if (a[index] == a[pivot]) {
				swap(a, index, rightWall);
				rightWall++;
			}
		}

		return (leftWall + rightWall) / 2;
	}
		
	// helper function for swapping values in an array
	public static void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}

	// helper function for print arrays of Integers
	public void printArray(int[] a) { 
		String printStr = "[";
        	for (int n : a) {
			printStr += " " + n;
		}
		System.out.println(printStr += " ]");
	}

	// driver helper function for testing quickSort
	public int[] randomArray() {
		int[] array = new int[(int)(Math.random() * 20) + 5];
		for (int x = 0; x < array.length; x++) {
			array[x] = (int)(Math.random() * 100);
		}
		return array;
	}

	// driver for testing
	public static void main(String[] args) {

		QuickSort2 quicky = new QuickSort2();
		System.out.println("\nTesting QuickSort2...");
		for (int x = 0; x < 10; x++) {
			int[] r = quicky.randomArray();
			System.out.println("\nBefore QuickSort2:");
			quicky.printArray(r);
			System.out.println("After QuickSort2:");
			quicky.quickSort2(r);
			quicky.printArray(r);
		}
		System.out.println();
	}
}
