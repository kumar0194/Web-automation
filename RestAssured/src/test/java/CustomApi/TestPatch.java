package CustomApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPatch {
	
	@Test
	public void test() {

	baseURI = "http://localhost:3000/" ;
	
	JSONObject request = new JSONObject();
	request.put("lastName", "Lawrence");
	
	
	given().
		headers("content-type", "application-json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		patch("/users/4").
	then().
		statusCode(200).log().all();
	
	}


}
