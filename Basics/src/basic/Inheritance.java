package basic;

public class Inheritance {

	public String val() 
	{

		String name = "Jaya";
		System.out.println("name is " + name);
		return name;

	}

	public static void main(String[] args)
	{

		//new Inheritance().val();
     //  val();
//		Inheritance one = new B(null, 0);
		
	Inheritance obj= new C()	;
	obj.val();	 
	
	B objb=new B();
	objb.val();
	
}
	
	static class B extends Inheritance
	  {
	 
	  
	  public B()
	  {
		  super();
	  }
	  
	  
	  public String val() 
		{

			String name = "Shubhi";
			System.out.println("name is " + name);
			return name;

		}

}
	 
	static class C extends B
	  {
	 
	  
	  public C() {
		  super();
	  }
		
	  
	  public String val() 
		{

			String name = "Jha";
			System.out.println("name is " + name);
			return name;

		}

}
}