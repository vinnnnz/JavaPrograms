/**
 * 
 */
package com.vineet.javaprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vineet Kumar
 *
 */
public class RemoveNonAsciiChar {
	public static String removeNonAscii(String source){
		String regex = "[^\\p{ASCII}]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(source);
		if(matcher.find())
			return source.replaceAll(regex, "");
		return source;
	}
	
	public static void main(String[] args) {
		//you can write non ascii character by pressing alt + numbers(1,2,3,4,5,6) and save file in UTF-8 format
		System.out.println(removeNonAscii("µhello th≥is is σa text"));
	}
}
