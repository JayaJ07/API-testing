package basic;

import java.util.HashMap;

public class ValidateTheTwoColmsOfTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>hm=new HashMap<>();
		
		hm.put("A", 25);
		hm.put("B", 35);
		hm.put("C", 45);
		hm.put("D", 55);
		hm.keySet();

HashMap<String, Integer>hm1=new HashMap<>();
		
		
		hm1.put("E", 25);
		hm1.put("F", 95);
		hm1.put("G", 45);
		hm1.put("H", 5);
		hm1.keySet();
		
		
		System.out.println("vjhvjh");
		
		for (Object valuesOfhm1 : hm1.values()) {
			System.out.println("8888888888vjhvjh");
			for (Object valuesOfhm : hm.values()) {
				System.out.println("vjhvjh");
				if(hm.get(valuesOfhm).equals(hm1.get(valuesOfhm1)))
					
				{
					System.out.println("Done dona done");
				}
				
				else
				{
					System.out.println("The value for "+hm.get(valuesOfhm)+" is not equals to "+hm1.get(valuesOfhm1));
				}
					
			}
			
		}
	/*for (String string : args) {
		
		System.out.println("val is"+hm.get(string));
	}*/
	}
}
