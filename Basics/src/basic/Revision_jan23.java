package basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.sun.xml.xsom.impl.ForeignAttributesImpl;

public class Revision_jan23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fibonnaci Series 0 1 1 2 3 5

		/*
		 * int first=0; int second =1; int temp=0; System.out.print(+first+""+second);
		 * 
		 * for (int i = 0; i <7; i++) { temp=first+second; System.out.print(+temp);
		 * first=second; second=temp;
		 */

		/*
		 * //Palindrome ABCDCBA
		 * 
		 * String pal="ABCDCBA"; String firsthalf=""; String secondhalf=""; int halflen=
		 * (pal.length()+1)/2; for (int i = 0; i < halflen; i++) {
		 * System.out.print(pal.charAt(i)); firsthalf=firsthalf+""+pal.charAt(i); }
		 * 
		 * 
		 * 
		 * for (int j = (halflen*2)-2; j < halflen; j--) {
		 * System.out.println("j value is "+j); System.out.print(pal.charAt(j));
		 * secondhalf=secondhalf+""+pal.charAt(j); }
		 * 
		 * if (firsthalf.equalsIgnoreCase(secondhalf)) {
		 * 
		 * System.out.println("Congrats it's a palidrome");
		 * 
		 * }
		 * 
		 * else { System.out.println("No it's not"); }
		 * System.out.println("Firsthalf is "+firsthalf);
		 * System.out.println("secondhalf is "+secondhalf);
		 * 
		 * }
		 * 
		 * 
		 * 
		 */

		// Write a code for finding non-repeating character from the given string
		// "I am travelling to Banglore by bus"?

		/*
		 * String value = "I am travelling to Banglore by bus?".trim();
		 * 
		 * value= value.replaceAll("\\s", "").toLowerCase(); System.out.println(value);
		 * 
		 * char[] array= value.toCharArray(); int count=0; for(int i=0;
		 * i<array.length;i++) { int flag=0; for (int j = 0; j<array.length-1; j++) {
		 * 
		 * if ((i!=j) && (array[i]==array[j])) {
		 * 
		 * flag=0; break;
		 * 
		 * } else {
		 * 
		 * flag=1; }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * if(flag==1) { System.out.println(array[i]); } }
		 * 
		 * 
		 * 
		 * 
		 * // To count occurences usign hashmap
		 * 
		 * 
		 * 
		 * HashMap<Character, Integer>map= new HashMap<>();
		 * 
		 * for (int i = 0; i < value.length(); i++)
		 * 
		 * {
		 * 
		 * if (map.containsKey(value.charAt(i))) {
		 * 
		 * map.put(value.charAt(i),+map.get(value.charAt(i))+1);
		 * 
		 * 
		 * 
		 * }
		 * 
		 * else { map.put(value.charAt(i), 1); }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * for (Character string : map.keySet()) {
		 * System.out.println("the map value of "+string+"is "+map.get(string)); }
		 */

	

	// largest without using if else

		/*
		 * int a = 50; int b = 15; int c=25;
		 * 
		 * TreeSet<Integer>tree= new TreeSet<>(); tree.add(a); tree.add(b); tree.add(c);
		 * 
		 * System.out.println("The final value is "+tree.last());
		 */
	
	
	
	//no of upper or lowercases character IamTravellingToGOA
	
		/*
		 * String word="  I    am  TravellingToGOA";
		 * 
		 * word=word.replaceAll("\\s", "").trim(); int UppercaseCount=0;
		 * 
		 * int LowercaseCount=0;
		 * 
		 * 
		 * for (int i = 0; i < word.length(); i++) { if (((int)word.charAt(i)>=65)
		 * &&((int)word.charAt(i)<=90)) { UppercaseCount++; } else { LowercaseCount++;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * } System.out.println("Theuppercase count is "
		 * +UppercaseCount+" The lowercase count is "+LowercaseCount);
		 */
	
	int n= 121;
	
	String newvaleu=Integer.toString(n);
	String reverse="";
	boolean flag= false;
	System.out.println("n is "+newvaleu);
	for (int j=newvaleu.length()-1; j>=0; j--) 
	{
		 reverse=reverse+""+newvaleu.charAt(j);
		 System.out.println(reverse);
	}
	if (newvaleu.equalsIgnoreCase(reverse))
	{
		flag=true;
		System.out.println("is palindrome");
	}
	
	else
	{
		flag=false;
	}
	
	
	System.out.println("reverse is "+reverse);

	}
	
	
	
	}

