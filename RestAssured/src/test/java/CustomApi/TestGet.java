package CustomApi;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGet {
	
	@Test
	public void test() {

	System.out.println("Hello");
	Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(res.getStatusCode());
	
	}
	
}
