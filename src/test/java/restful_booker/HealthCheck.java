package restful_booker;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class HealthCheck {

    RestAssured restAssured=null;
    ResponseSpecification resSpecification=null;
    @BeforeTest
    public void setBaseURI(){
        restAssured.baseURI="https://restful-booker.herokuapp.com";
    }
    @Test
    public void healthCheckPingMethod(){
        String resp = given()
                .when()
                .get(IPathParam.PING_PATH_PARAM)
                .then().extract().statusLine();
        System.out.println(resp);
        assertEquals("HTTP/1.1 201 Created",resp);

    }
}
