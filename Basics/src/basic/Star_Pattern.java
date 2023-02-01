package basic;

public class Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line="I am Jaya";
		StringBuffer line1=new  StringBuffer(line);
		
		
		System.out.println(line1.reverse());
		String arr[]= line1.toString().split(" ");
		
		System.out.println("First letter is "+arr[0]+ " And the last word is " +arr[2]);
	}

}
