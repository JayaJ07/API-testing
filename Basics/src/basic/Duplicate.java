package basic;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]={1,5,1,9,0,6,0};	
	List<Integer>DuplicateList=new ArrayList<>();
	for (int i = 0; i < arr.length-1; i++) {
		
		for (int j = i+1; j <arr.length; j++) {
	
		if (arr[i]==arr[j]) {
			System.out.println("The value arr[i] getting repeated  is "+arr[i]);
			
			DuplicateList.add(arr[i]);
		
		}
		
		}
		
	}System.out.println("please find the list "+DuplicateList);
		
	}

}
