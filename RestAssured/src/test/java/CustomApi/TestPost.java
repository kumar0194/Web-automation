package CustomApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPost {
	
	@Test
	public void test() {

	baseURI = "http://localhost:3000/" ;
	
	JSONObject request = new JSONObject();
	request.put("firstName", "Tom");
	request.put("lastName", "Cooper");
	request.put("subjectId", 1);
	
	given().
		headers("content-type", "application-json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		post("/users").
	then().
		statusCode(201).log().all();
	
	}

}
