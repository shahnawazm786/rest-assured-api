package restful_booker;

import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HealthCheck {

    RestAssured restAssured=null;
    ResponseSpecification resSpecification=null;
    @BeforeTest
    public void setBaseURI(){
        restAssured.baseURI="https://restful-booker.herokuapp.com";
    }
    @Test
    public void healthCheckPingMethod(){

    }
}
