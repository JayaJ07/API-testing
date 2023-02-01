package basic;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int firstno=0;
		int secondno=1;
		int next;
		for (int i = 0; i < 10; i++) {
			
			 next=firstno+secondno;
			 firstno=secondno;
			 secondno=next;
			 System.out.println("the next nlo is "+next);
		}
	
		 
	}

}
