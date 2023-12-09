package CustomApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPut {
	
	@Test
	public void test() {

	baseURI = "http://localhost:3000/" ;
	
	JSONObject request = new JSONObject();
	request.put("firstName", "Max");
	request.put("lastName", "Hendrix");
	request.put("subjectId", 1);
	
	given().
		headers("content-type", "application-json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
	when().
		put("/users/4").
	then().
		statusCode(200).log().all();
	
	}

}
