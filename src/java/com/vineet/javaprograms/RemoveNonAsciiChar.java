/**
 * 
 */
package com.vineet.javaprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author DELL PC
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
		System.out.println(removeNonAscii("µhello th≥is is σa text"));
	}
}
