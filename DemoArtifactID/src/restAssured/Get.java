package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Get {

		@Test
		public void getMethod() {
			
			RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
			RequestSpecification httpRequest = RestAssured.given();
			Response res = httpRequest.request(Method.GET, "");
			System.out.println(res.getStatusCode());
			System.out.println(res.getStatusLine());
			ResponseBody body = res.getBody();
			System.out.println(res.prettyPrint());
			System.out.println(body.asString());
			
		}

}
