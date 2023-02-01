package basic;

public class RemoveMultitpleSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Line="My     name  is    jaya";
	
		Line.trim();
		Line.replaceAll("( )+", " ");
	//	(Line).replaceAll("  ", " ");
		System.out.println(Line.replaceAll("( )+", " "));
		
	}

}
