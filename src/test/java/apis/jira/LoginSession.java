package apis.jira;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class LoginSession {
    SessionFilter session;
    @BeforeTest
    public void setup(){
        //RestAssured.baseURI="http://localhost:8000/";
    }
    @Test
    public void GetSession(){
        session=new SessionFilter();
        //String response=RestAssured.given()
        Response response=RestAssured
                .given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"username\":\"kaz2024\",\n" +
                        "    \"password\":\"kaz2024\"\n" +
                        "}")
                .filter(session)
                .log()
                .all()
                .when()
                .post("/rest/auth/1/session")
                .then()
                .extract().response();
                //.asString();
        //System.out.println(response);

    }

    @Test
    public void getTokenOrangeHRMS(){

    }

}
