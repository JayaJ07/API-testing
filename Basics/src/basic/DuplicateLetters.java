package basic;

public class DuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="MESSENGER";
		char ConversaionToarray[] = s.toCharArray();
		
		int j=0;
		
		for (int i = 0; i < ConversaionToarray.length; i++) {
			
			for ( j = ConversaionToarray.length-1; j!=i; j--) {
				
				if (ConversaionToarray[i]==ConversaionToarray[j]) {
					
					
				
				System.out.println("Duplicate found for letter "+ConversaionToarray[j]);	
				
				
				}
				
	
			}
	
			
			
		}
		
	}

}
