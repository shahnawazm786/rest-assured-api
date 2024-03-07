package apis.jira;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
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
        RestAssured.baseURI="https://reqres.in/";
        given().expect().when().get("api/users/23")
                .then().assertThat().statusCode(404);
    }
    @Test
    public  void givenExceptNotFound1(){
        RestAssured.baseURI="https://reqres.in/";
        String resp = given().expect().when().get("api/users/2")
                .then().extract().response().asString();
        System.out.println(resp);
        JsonPath path=new JsonPath(resp);
        System.out.println(path.getString("data.id"));
        System.out.println(path.getString("data.email"));
        System.out.println(path.getString("data.first_name"));
        System.out.println(path.getString("data.last_name"));
        System.out.println(path.getString("data.avatar"));
    }
    @Test
    public  void getHeader(){
        RestAssured.baseURI="https://reqres.in/";
        String resp = given().expect().when().get("api/users/2")
                .then().extract().response().asString();
        System.out.println(resp);
        JsonPath path=new JsonPath(resp);
        System.out.println(path.getString("data.id"));
        System.out.println(path.getString("data.email"));
        System.out.println(path.getString("data.first_name"));
        System.out.println(path.getString("data.last_name"));
        System.out.println(path.getString("data.avatar"));
    }
}
