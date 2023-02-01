package basic;

public class FibonnaciSeries {

	public static void main(String[] args) {

		int temp=0;
		int first_no=0;
		int secondNo=1;
		System.out.print(+temp);
		temp=first_no+secondNo;
		System.out.print(", "+temp);
		
	
		for (int i = 0; i <100; i++) {
			
			temp=first_no+secondNo;
			first_no=secondNo;
			secondNo=temp;
		System.out.print(", "+temp);	
			
		}
		 
	        
		
		
	//to take out a particular word
	
		/*String val=   "I am - good girl - by default";
	
	
	
	String newval[]=val.split("-");
	String Latest[]=newval[1].split(" ");
	System.out.println(Latest[2]);*/
	}
	
	
	
	
}
