package in.reqres.reqresinfo;


import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ReqresGetAllUser extends TestBase {
    @Test
    public void getAllUser() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        int page = response.then().extract().path("page");
        System.out.println("Page : " +page);

        int per_page = response.then().extract().path("per_page");
        System.out.println("per_page : " +per_page);

        int id = response.then().extract().path("data[1].id");
        System.out.println("data[1].id : " +id);

        String first_name = response.then().extract().path("data[3].first_name");
        System.out.println("first_name : " +first_name);

        List<?> listofdata =  response.then().extract().path("data");
        System.out.println("List of data : " +listofdata.size());

        String avatar = response.then().extract().path("data[5].avatar");
        System.out.println("avatar : " +avatar);

        String supportURL = response.then().extract().path("support.url");
        System.out.println("supportURL : " +supportURL);

        String supportxt = response.then().extract().path("support.txt");
        System.out.println("support Text : " +supportxt);

    }


}
