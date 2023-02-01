package basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Median {
	
public static  int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
	
	int concatenatearray[]= new int[nums1.length+nums2.length];
	int i=0;
	float medianvalue=0;
	
	TreeSet<Integer>sortedmap= new TreeSet<>();
	
	while(i<nums1.length )
	{concatenatearray[i]=nums1[i];
		System.out.println("from num1 "+concatenatearray[i]);
		i++;
	}
	int j=0;
	while(j<nums2.length)
		
	{
		concatenatearray[i]= nums2[j];
		System.out.println("from num2 "+concatenatearray[i]);
		j++;
		i++;
	}
	
	for (int j2 = 0; j2 < concatenatearray.length; j2++) {
		System.out.print(+concatenatearray[j2]+" ");
		sortedmap.add(concatenatearray[j2]);
		
		
		
		
	}
	System.out.print("After sorting the values are "+sortedmap+" ");
	int median= sortedmap.size()/2-1;
	System.out.println("Median is "+median);
	List<Integer>sortedlist= new ArrayList<>(sortedmap);
	if (sortedlist.size()%2==0) 
	{
		System.out.println("sortedlist.get(median)->"+sortedlist.get(median));
		medianvalue=(sortedlist.get(median)+sortedlist.get(median))/2;
		System.out.println("for even the Median is "+median);
		System.out.println("for even the Medianvalue is "+medianvalue);
	} else
	{
median= (sortedlist.size()+1)/2;
medianvalue=sortedlist.get(median-1);
System.out.println("for Odd the Median is "+median);
System.out.println("for Odd the Medianvalue is "+medianvalue);
	}

        return concatenatearray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {8,1,3,6,0};
		int[] nums2 = {7,5,5};
		findMedianSortedArrays(nums1,nums2);
		

	}

}
