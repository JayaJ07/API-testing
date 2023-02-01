package basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Check=191;
		int reverse = 0;int remainder;
		int temp=Check;
		while(Check>0)
		{
			remainder=Check%10;
		reverse=reverse*10+remainder;
		Check =Check/10;
		
		
		}if(temp==Check)
		{
			System.out.println("It is a palindrfome");
		}
		
		System.out.println("Not a palindrome");
		
		
		
	}

}
