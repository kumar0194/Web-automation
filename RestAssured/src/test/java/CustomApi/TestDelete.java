package CustomApi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestDelete {

	@Test
	public void test() {

	baseURI = "http://localhost:3000/" ;
	
	
	when().
		delete("/users/4").
	then().
		statusCode(200).log().all();
	
	}
}
