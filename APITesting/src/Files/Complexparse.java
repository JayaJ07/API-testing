package Files;

import io.restassured.path.json.JsonPath;

public class Complexparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JsonPath js= new JsonPath(Payload.Courseprice());
		int count = js.getInt("courses.size()");
		System.out.println("count of courses are "+count);
		
		int totalamount= js.getInt("dashboard.purchaseAmount");
		System.out.println("Total amount is "+totalamount);
		
		String title= js.getString("courses[0].title");
		System.out.println("title "+title);
		
		//to print all the titles of a dynamic json
		String copy;
		for (int i = 0; i < count; i++) {
			
		String dynamiccoursetitle=	js.get("courses[" +i+"].title");
		
		
		System.out.println("Prices of respective sbjects "+js.get("courses[" +i+"].price").toString());
			
		System.out.println("all course titles "+dynamiccoursetitle);
		
		
		
		if (js.get("courses[" +i+"].title").equals("RPA")) {
			
			 copy=js.get("courses[" +i+"].copies");
			
			System.out.println(copy);
			break;
			
		}
		
		
		}
		
				

	}

}
