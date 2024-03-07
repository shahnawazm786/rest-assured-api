package restful_booker;

import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    RestAssured restAssured=null;
    ResponseSpecification resSpecification=null;
    @BeforeTest
    public void setBaseURI(){
        restAssured.baseURI="https://restful-booker.herokuapp.com";
    }
}
