/**
 * This file implements comparator to print object in reverse order
 */
package com.vineet.javaprograms;

import java.util.Comparator;

/**
 * @author Vineet Kumar
 *
 */
public class ReverseOrder implements Comparator<Integer>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Integer o1, Integer o2) {
		return (o2-o1);
	}
	
}
