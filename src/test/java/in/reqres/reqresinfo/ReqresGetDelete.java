package in.reqres.reqresinfo;


import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ReqresGetDelete extends TestBase {
    @Test
    public void getDeleteUser() {
        Response response = given()
                .pathParam("id",2)
                .when()
                .delete("users/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
