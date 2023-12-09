package defaultPackage;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPOST {
	
	@Test
	public void test02() {
		
//		Map<String,Object> map = new HashMap<String, Object>();
//		map.put("name","Kumar");
//		map.put("job", "Tester");
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		request.put("name", "Kumar");
		request.put("job", "Tester");
		System.out.println(request.toJSONString());
		
		given().
			header("content-type","application-json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).log().all();
		
	}

}
