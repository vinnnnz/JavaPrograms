
package com.vineet.javaprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vineet Kumar
 *
 */
public class RegExApp {
	public static void main(String[] args) {
		String text = "hello 12 # this is for testing";
		String regex = "hello";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(text);
		if(m.find()){
			System.out.println("found");
		}
		else{
			System.out.println("not found");
		}
	}
}
