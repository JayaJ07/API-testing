package basic;

import java.util.Arrays;


import org.apache.commons.lang3.ArrayUtils;


public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d1="Mad";
		String d2="Dam";
		
		char[]String1 =d1.toLowerCase().toCharArray();
		
	Character[] Word1 =	ArrayUtils.toObject(String1) ;
		
	char[]String2 =d2.toLowerCase().toCharArray();
	
	Character[] Word2 =	ArrayUtils.toObject(String2) ;
		
Arrays.sort(Word1);
	Arrays.sort(Word2);
	
	if (Arrays.equals(Word1,Word2)) {
		
		System.out.println("Its an anagram");
		
	} else {
		
		
		System.out.println("It isn't");

	}
		
		
	}

}
