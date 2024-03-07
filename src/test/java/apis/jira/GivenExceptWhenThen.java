package apis.jira;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GivenExceptWhenThen {
    @Test
    public  void givenExceptWhenThenMethod(){
        RestAssured.baseURI="https://reqres.in/";
        given().queryParam("page",10)
                .expect().when().get("api/students")
                .then().body("page",equalTo(10));
    }
    @Test
    public  void givenExceptNotFound(){
       // RestAssured.baseURI="https://reqres.in/";
        given().expect().when().get("api/users/23")
                .then().assertThat().statusCode(404);
    }
}
