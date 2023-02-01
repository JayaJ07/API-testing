package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.sun.xml.xsom.impl.ForeignAttributesImpl;

public class AllBasicInOne {

	

	public static void main(String[] args) {
		
	
		
	

		// int no=121;

		/********** Fibonnaci series *********/

		/*
		 * int firstno=0; int secondno=1; int temp;
		 * 
		 * System.out.print(firstno); for (int i = 0; i <= no; i++) {
		 * 
		 * 
		 * temp=firstno+secondno;
		 * 
		 * firstno=secondno; secondno=temp;
		 * 
		 * System.out.print(" "+temp); }
		 */

		/*********************** Factorial *********************/
		/*
		 * int fact=1; for (int i = 1; i <=no; i++) {
		 * 
		 * fact=fact*i; System.out.print(" "+fact);
		 * 
		 * }
		 */

		/***************** Prime no *******************/

		/*
		 * for (int i = 2; i < no; i++) {
		 * 
		 * if (no%i==0) {
		 * 
		 * 
		 * System.out.println("isn't prime");
		 * 
		 * }
		 */

		/************* Palindrome *****************/

		/*
		 * int rev=0; int temp=1331; while (no>0) { int n=no%10;
		 * 
		 * rev=rev*10+n;
		 * 
		 * no=no/10;
		 * 
		 * 
		 * } if (temp==no) { System.out.println("it is a palindrome"); }
		 */

		/************************* Remove duplicates ************************/

		/*
		 * int arr1[]={1,2,3,45}; int arr2[]={2,7,1,9};
		 * 
		 * Integer[] WrapperArr1=ArrayUtils.toObject(arr1);
		 * Integer[] WrapperArr2=ArrayUtils.toObject(arr2);
		 * 
		 * List<Integer> list = new ArrayList<Integer>(); 
		 * List<Integer> list2 = new ArrayList<Integer>();
		 * 
		 * for (int i = 0; i < WrapperArr2.length; i++)
		 * 
		 * { list.add(WrapperArr2[i]);
		 * 
		 * } System.out.print("List1 is "+list); for (int i = 0; i < WrapperArr1.length;
		 * i++)
		 * 
		 * { list2.add(WrapperArr1[i]);
		 * 
		 * 
		 * } System.out.print("List2 is "+list2);
		 * 
		 * 
		 * list2.removeAll(list);
		 * 
		 * System.out.println("New list2 is "+list2);
		 */

		/**************************** Sorting *****************/

		/*
		 * int arr1[]={45,2,1,3,};
		 * 
		 * Integer[] WrapperArr1=ArrayUtils.toObject(arr1);
		 * 
		 * 
		 * 
		 * List<Integer> list2 = new ArrayList<Integer>();
		 * 
		 * 
		 * 
		 * for (int i = 0; i < WrapperArr1.length; i++)
		 * 
		 * { list2.add(WrapperArr1[i]);
		 * 
		 * 
		 * } System.out.print("List is "+list2);
		 * 
		 * Collections.sort(list2);
		 * 
		 * System.out.print("Sorted list is "+list2);
		 */

		/********************* duplicates *************/

		/*
		 * String msg="MESSENGER"; int flag=0; char[] CharMsg= msg.toCharArray(); int
		 * count=0;
		 * 
		 * for (int i = 0; i < msg.length(); i++) {
		 * 
		 * 
		 * for (int j = msg.length()-1; j !=i; j--)
		 * 
		 * {
		 * 
		 * if (CharMsg[i]==CharMsg[j]) {
		 * System.out.println("Duplicate found for "+CharMsg[j]); }
		 * 
		 * 
		 * }
		 * 
		 * }
		 */

		/*************
		 * Changing duplicate second occurence///Not Successful yet
		 ***********/

		
		/*	String sentence = "Welcome to the interview";
														  List<Character> list=new ArrayList<Character>(); char[]
														 sentochar=sentence.toCharArray(); int count=0; int flag=0;
														  for (int i = 0; i < sentochar.length; i++) {
														  
														  flag =0; for (int j = sentochar.length-1; j !=i; j--)
														  
														 { count=0;
														  
														  if (sentochar[i]==sentochar[j]) {
														  
														  System.out.println("The duplicate letter is "+sentochar[j]);
														  list.add(sentochar[i]); String sent=
														  sentochar.toString().replaceFirst("sentochar[j]", "X");
														  System.out.println("New one is "+sent); }
														  
														  
														  } // if (flag==1) {
														 */		  
		  
		  //} }
		  
		/*
		 * char array[]= sentence.toCharArray(); for (int i = 0; i < array.length; i++)
		 * { int counter=0; String NoOfOccurence=""; int flag=0; HashMap<Character,
		 * Integer>map= new HashMap<>(); for (int j = 0; j < array.length; j++) {
		 * 
		 * 
		 * map.put(array[i], counter);
		 * 
		 * for (int j2 = array.length-1; j2!=j; j2--) { if (array[j]==array[j2]) {
		 * 
		 * System.out.println("found a duplicate of "+array[j2]); map.put(array[j2],
		 * counter +1); }
		 * 
		 * else { map.put(array[j2], counter); }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("The final coun ting of each occurence is "+map);
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		
		
	  
		
		/*//////////////////////////// *****Duplicate Letters in an ARRAY of strings///

		String Arr[] = { "cool", "cook", "toolc" };

		StringBuffer s = new StringBuffer();

		for (int j = 0; j < Arr.length; j++) {

			s = s.append(Arr[j]);

		}

		System.out.println("The value in s is " + s);

		String newStringis = s.toString();

		char[] newStringtochararr = newStringis.toCharArray();

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < newStringtochararr.length; i++) {

			for (int j = i + 1; j < newStringtochararr.length; j++) {

				if ((newStringtochararr[i] == newStringtochararr[j]) && (!list.contains(newStringtochararr[i]))) {

					list.add(newStringtochararr[j]);

					break;

				}

			}

		}
		System.out.println(" Found a duplicate " + list);
		
		
		

		*//************* Cout no of digits in a string *************/
		/*
		 * // /*int no=12345; // String value=String.valueOf(no); // //
		 * System.out.println(value.length()); //
		 * 
		 * 
		 * 
		 * 
		 *//*************** Palindrome of a string using single loop ****************//*
		String name = "MADAM";
		Boolean flag = false;
		int counter = name.length() - 1;
		char[] Charname = name.toCharArray();
		for (int i = 0; i < name.length() / 2; i++) {

			if (Charname[i] == Charname[counter]) {

				System.out.println("Found the mirror image of " + Charname[counter]);
				counter--;
			}

		}

	}
	}
	*/
		//***********Count no of occurences for an alphabet in a string and replaces the 2nd occurence with a (*) :):):):):) ************//
		//:):):):):)  FINALLY :):):):)
		String sentence1="Welcome to Infosys";
		String newsent=	sentence1.replaceAll("\\s+", "");
		System.out.println("The sentence after removal of spaces is "+newsent);
		char Arrsent[]=newsent.toCharArray();
		HashMap<Character, Integer>map1= new HashMap<>();
		int counter=1;
		String Modifiedstring="";
		StringBuffer arrnewval = new StringBuffer(); //So that it can use the function SetCharAt
		for (int i = 0; i < Arrsent.length; i++) {
			
			map1.put(Arrsent[i],counter);// it sets the unique keys from array into map
			
		}
		System.out.println("Displaying map1 "+map1);
		
		for (int i = 0; i < Arrsent.length; i++) {
			for (int j = i+1; j < Arrsent.length; j++) {
				if (Arrsent[i]==Arrsent[j]) 
				{
					map1.put(Arrsent[i],map1.get(Arrsent[i])+1); // it increments the value of keys each time it finds a duplicate
					
					if ((map1.get(Arrsent[i])==2) )
					{
						System.out.println("Found the value as 2 for "+Arrsent[j]);
						//Modifiedstring=	newsent.replace(Arrsent[j], '*');
						
					
						 arrnewval = new StringBuffer(newsent);
						
						arrnewval.setCharAt(j, '*'); //Sets the second occurence as * 
						
						System.out.println(" Look at the modified array evertime "+arrnewval); //Prints the final Value
					}
				}
			}
			
		}
	//	System.out.println(" Look at the modified array "+arrnewval);
		System.out.println("The final keys with no of occurences as values are displayed as follows "+map1);
		
	}
  
  
  }
 
