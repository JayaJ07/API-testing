package basic;

import java.util.TreeMap;

public class Treemap_Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,Integer> tm= new TreeMap<Integer, Integer>();
		tm.put(1,3);
		tm.put(2,2);
		tm.put(3,0);
		tm.put(4,5);
		System.out.println("let'c check if treemap sortig works" +tm);
		
		tm.put(1,2);
		System.out.println("let'c check if treemap sortig works" +tm.get(1));
		
	}

}
