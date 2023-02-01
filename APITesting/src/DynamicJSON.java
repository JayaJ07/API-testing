import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Files.Payload;
import Files.ReusableMethod;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJSON 
{

	@Test(dataProvider="BooksData")
	public void addbook(String aisle,String isbn)
	{
		RestAssured.baseURI="http://216.10.245.166";
	String response=	given().log().all().header("Content-Type", "application/json").body(Payload.addbook("003","bsj")).when().post("/Library/Addbook.php").then().log().all().statusCode(200).extract().response().asString();
	JsonPath js=	ReusableMethod.rawtojson(response);
	String id=js.get("ID");	
	
	System.out.println("The id of new book is "+id);
	
	}
	
	
	
	@DataProvider(name="BooksData")
	public Object[][] getdata()
	{
		return new Object[][] {{"abc","004"},{"fvw","007"},{"ffs","098"}};
	}
	
}
