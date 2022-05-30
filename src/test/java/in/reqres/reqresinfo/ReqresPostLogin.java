package in.reqres.reqresinfo;


import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ReqresPostLogin extends TestBase {
    @Test
    public void createUserLogin() {


        ReqresPojo reqresPojo = new ReqresPojo();
        reqresPojo.setEmail("eve.holt@reqres.in");
        reqresPojo.setPassword("cityslicka");

        Response response = given()
                .header("Connection", "keep-alive")
                .body(reqresPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
