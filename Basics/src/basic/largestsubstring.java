package basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;




public class largestsubstring {
	
	
	public static void main(String[] args) {
	
		 String s = "abcabcbb";
		
		
		 char[] s1=s.toCharArray();
		Character[] wrapper1= ArrayUtils.toObject(s1);
		
		
		
		HashSet<Character>set= new HashSet<>();
		for(int i=0;i<wrapper1.length;i++)
		{
			set.add(wrapper1[i]);
		}
		
	
System.out.println("size of value willbe "+set.size());
}
}