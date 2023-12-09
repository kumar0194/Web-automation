package defaultPackage;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPATCH {
	
	@Test
	public void test03() {

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
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();
		
	}
	
}
