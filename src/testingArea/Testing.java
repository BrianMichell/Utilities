package testingArea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {

	public static void main(String[] args) {
		String str = "6.6788912631865321 test";
		regexChecker(str);

	}
	
	private static double regexChecker(String input){
		String ex = "[0-9\\.]{3,}";
		Pattern checkRegex = Pattern.compile(ex);
		Matcher regexMatcher=checkRegex.matcher(input);
		while(regexMatcher.find()){
			if(regexMatcher.group().length()!=0){
				System.out.println(regexMatcher.group().trim());
				//return Double.valueOf(regexMatcher.group().trim());
			}
		}
		System.out.println("Nothing found!");
		return 0.00;
	}

}
