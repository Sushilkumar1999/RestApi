package rest_Api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_Request {
	
	
	@Test
	public void test1() {
		
		RestAssured.given()
        .baseUri("http://localhost:8088/employees")
        .when()
        .get()
        .then()
        .statusCode(200)
        .log()
        .all();
	}

}
