/**
 * This is an example to expand an array dynamically
 */
package com.vineet.javaprograms;

/**
 * @author Vineet Kumar
 *
 */
public class DynamicArray {
	
	public static void expandArray(){
		int[] array = {2,4,5,6};
		int[] newArray = new int[array.length+1];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array = newArray;
		System.out.println(array.length);
	}
	public static void main(String[] args) {
		DynamicArray.expandArray();
	}
}
