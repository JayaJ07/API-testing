package basic;

public class Uppercase_Tolowecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String Word= "jAYa vYaS";
		
		char[] array=Word.toCharArray();
		
		
		for (int i = 0; i < array.length; i++) {
			
		if((int)array[i]>=65 && (int)array[i]<=90)
		{
			
			String LowecaseObject=String.valueOf(array[i]);
			
			System.out.print(LowecaseObject.toLowerCase());
			
		}
		
		else
		{
			String UppercaseObject=String.valueOf(array[i]);
			
			System.out.print(UppercaseObject.toUpperCase());
		}
			
		
		}
	}

}
