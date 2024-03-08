package apis.restful_booker;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class AdminSession extends BaseClass {

    @Test
    public void getToken(){
        Map<String,String> map=new HashMap<>();
        map.put("username","admin");
        map.put("password","password123");
         given()
                .header("Content-Type", ContentType.JSON)
                .body(map)
                .when()
                .put(IPathParam.AUTH_PATH_PARAM)
                .then().log().all()
                .extract().response().then().statusCode(404);
        //System.out.println(resp);

    }
}
