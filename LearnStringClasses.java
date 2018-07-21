package com.Ivan;

public class LearnStringClasses {

	public static void main(String[] args) {
		String x = "אבגדהו¸זחטיךכלמ";
		char CH[] = x.toCharArray();
		System.out.println(CH);
		
		int begin = 3;
		int end = 10;
		char GETchars[] = new char[end - begin];
		x.getChars(begin, end, GETchars, 0);
		System.out.println(GETchars);
		
		String y = new String("123אבגÃהו¸זחטיךכלמ");
		
		boolean bool = x.regionMatches(0, y, 3, 3);
		System.out.println(bool);
		
		boolean bool_2 = x.regionMatches(true, 0, y, 3, 4);
		System.out.println(bool_2);
		
		 

	}

}
