package basic;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]={1,2,3,45};
		int arr2[]={2,7,5,9};
		
		Integer Wrapperarr[]=ArrayUtils.toObject(arr1);
		
		Integer Wrapperarr2[]=ArrayUtils.toObject(arr2);
		
		List<Integer>list= new LinkedList<Integer>() ;
			
			for (int i = 0; i < Wrapperarr2.length; i++) {
				
				list.add(Wrapperarr2[i]);
				
			}
			
List<Integer>list1= new LinkedList<Integer>() ;
			
for (int i = 0; i < Wrapperarr.length; i++) {
	
	list1.add(Wrapperarr[i]);
	
}		
list.removeAll(list1);
System.out.println("Let's check if am successfull or not" +list);
	}

}
