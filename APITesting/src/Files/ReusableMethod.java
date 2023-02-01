package Files;

import io.restassured.path.json.JsonPath;

public class ReusableMethod {
	
	
	public static JsonPath rawtojson(String response)
	{
		JsonPath path= new JsonPath(response);
		return path;
	}

}
