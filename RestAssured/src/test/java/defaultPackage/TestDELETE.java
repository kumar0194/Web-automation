package defaultPackage;

import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestDELETE {

	@Test
	public void test03() {
		
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).log().all();
		
	}
	
}
