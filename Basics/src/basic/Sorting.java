package basic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.ArrayUtils;

public class Sorting {
	
	public static void main(String[] args) {
		
		
		int arr[]={1,2,7,5,0};
		
		Integer arr1[]=ArrayUtils.toObject(arr);
		
		
		
		java.util.List<Integer>list1=new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i])	;
		}
	
		Collections.sort(list1);
		
		System.out.println("The sorted list is "+list1);
		
		
	}

}
