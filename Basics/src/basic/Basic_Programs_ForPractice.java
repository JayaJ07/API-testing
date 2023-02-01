package basic;

public class Basic_Programs_ForPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=121;
		/****************Fibonacci*******************/
		
		
		/*int temp=0;
		int first_no=0;
		int secondNo=1;
		System.out.print(+temp);
		temp=first_no+secondNo;
		System.out.print(", "+temp);
		
		for (int i = 0; i < n; i++) {
			
			temp=first_no+secondNo;
			first_no=secondNo;
			secondNo=temp;
			System.out.print(" , " +temp);
			
		}*/
		
		/************************Palindrome***************/
		
		/*int rev=0;int temp=121;
		int r;
		while (n>0) {
			
			r=n%10;
			rev=rev*10+ r;
			n=n/10;
			
			
			
			
			
			
		}
		if (rev==temp) {
			
			System.out.println("It is a palindrome");
			
		}
		
	}*/

		//////////////////////////******************Factorial************/
		
		
		int fact=1;
		
		for (int i = 1; i < n; i++) {
			
			fact=fact*i;
			
			System.out.println(" , "+fact);
			
		}
}
}