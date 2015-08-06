
package com.vineet.javaprograms;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author Vineet Kumar
 *
 */
public class FindDuplicates {
	public static String duplicateInArray(Object[] numbers) {
		Map<Object, Integer> map = new HashMap<Object, Integer>();
		for (int count = 0; count < numbers.length; count++) {
			if (map.containsKey(numbers[count])) {
				map.put(numbers[count], map.get(numbers[count]) + 1);
			} else {
				map.put(numbers[count], 1);
			}
		}
		StringBuilder result = new StringBuilder();
		result.append("Result of Dulplicate prints in {key=frequency} format:\n");
		return result.append(map.toString()).toString();
	}

	public static String duplicateWordsInString(String source) {
		String[] tokens = source.split(" ");
		return duplicateInArray(tokens);
	}

	public static String duplicateCharacters(String source) {
		return duplicateInArray(ArrayUtils.toObject(source.toCharArray()));
	}

	public static String duplicateCharacters(char[] source) {
		return duplicateInArray(ArrayUtils.toObject(source));
	}

	//For testing purpose. Please remove it.
	public static void main(String[] args) {
		Object a[] = new Object[] { "Hi", "B", "Hi", "A", "C", "A", "Hi" };
		char[] c = new char[] { 'a', 'a', 'b', 'c', 'd' };
		System.out.println(FindDuplicates.duplicateInArray(a));
		System.out
				.println(FindDuplicates
						.duplicateWordsInString("This is me and I am testing words count. I am .."));
		System.out
				.println(FindDuplicates
						.duplicateCharacters("This is me and I am testing words count. I am .."));
		System.out.println(FindDuplicates.duplicateCharacters(c));
	}
}
