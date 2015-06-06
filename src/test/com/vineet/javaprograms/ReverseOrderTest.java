/**
 * This Class file is to test ReverseOrder class
 */
package com.vineet.javaprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Vineet Kumar
 *
 */
public class ReverseOrderTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		final List<Integer> numbers = Arrays.asList(4,6,8,1,3,7);
		final List<Integer> expected = Arrays.asList(8,7,6,4,3,1);
		Collections.sort(numbers,new ReverseOrder());
		org.junit.Assert.assertEquals(expected, numbers);
	}

}
