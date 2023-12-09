package defaultPackage;

import org.json.simple.JSONObject;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class soapAPI {
	
	@Test
	public void test01() {
						
		Response res = get("https://reqres.in/api/users?page=2");
		
		System.out.println(res.asString());
		System.out.println(res.getBody());
		System.out.println(res.getStatusCode());
		System.out.println(res.getHeader("content-type"));
		
		int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode,200);
		
	}
	
	@Test
	public void test02() {
		
		given().
//			header("Content-type","application-json").
//			param("parameterName", "parameterValue").
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			body("data.id[0]", equalTo(7)).
			body("data.first_name", hasItems("Lindsay","Tobias"));
		
	}

}
