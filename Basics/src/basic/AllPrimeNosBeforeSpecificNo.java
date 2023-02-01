package basic;

public class AllPrimeNosBeforeSpecificNo {

	public static void main(String[] args) {
		
		int val=12;
		
		for (int No = 3; No < val; No++) {
			boolean flag=true;
			
			for (int i = 2; i < No; i++) {
				
				if(No%i==0)
				{
					break;
				}
				
				else
				{
					flag=true;
				}
				if(flag=true && i==No-1)
					
				{
					System.out.print(" "+No);
				}
				
			}
		}
	}

}
