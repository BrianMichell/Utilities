package com.github.BrianMichell.Utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BriRegex {

	public final String DOUBLE = "\\d\\.";
	public final String CHAR = "\\w";
	public final String NO_CHAR = "\\W";
	public final String NO_INT = "\\D";
	public final String LOWER_CASE = "a-z";
	public final String UPPER_CASE = "A-Z";

	/**
	 * Creates a new object of BriRegex which is a simple class aimed to make regular expressions simpler
	 */
	public BriRegex() {
	}


	/**
	 * Find items you want in a single string
	 * @param ex the expression to search by. 
	 * @param input The string you wish to search.
	 * @return An array list of strings from the input string found matching parameters given
	 */
	public ArrayList<String> find(String ex, String input) {
		ArrayList<String> ret = new ArrayList<>();
		Pattern checkRegex = Pattern.compile(ex);
		Matcher regexMatcher = checkRegex.matcher(input);
		while (regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				ret.add(regexMatcher.group().trim());
			}
		}
		return ret;
	}
	
	/**
	 * Find items you want in an array list of strings
	 * @param ex the expression to search by. 
	 * @param input The array list of strings you wish to search.
	 * @return An array list of strings from the input string found matching parameters given
	 */
	public ArrayList<String> find(String ex, ArrayList<String> input){
		ArrayList<String> ret = new ArrayList<>();
		Pattern checkRegex = Pattern.compile(ex);
		for(int i=0; i<input.size(); i++){
			Matcher regexMatcher = checkRegex.matcher(input.get(i));
			while (regexMatcher.find()) {
				if (regexMatcher.group().length() != 0) {
					ret.add(regexMatcher.group().trim());
				}
			}
		}
		return ret;
	}
	
	/**
	 * Find items you want in an array of strings
	 * @param ex the expression to search by. 
	 * @param input The array of strings you wish to search.
	 * @return An array list of strings from the input string found matching parameters given
	 */
	public ArrayList<String> find(String ex, String[] input){
		ArrayList<String> ret = new ArrayList<>();
		Pattern checkRegex = Pattern.compile(ex);
		for(int i=0; i<input.length; i++){
			Matcher regexMatcher = checkRegex.matcher(input[i]);
			while (regexMatcher.find()) {
				if (regexMatcher.group().length() != 0) {
					ret.add(regexMatcher.group().trim());
				}
			}
		}
		return ret;
	}


}
