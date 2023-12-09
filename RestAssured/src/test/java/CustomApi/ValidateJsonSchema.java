package CustomApi;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class ValidateJsonSchema {
	@Test
	public void test02() {		
			
			given().
				get("https://reqres.in/api/users?page=2").
			then().
			assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
				statusCode(200);
			
		}
	

}
