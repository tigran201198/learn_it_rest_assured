import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class GetBoardsTest {

    @BeforeAll
    public static void setBaseUrl() {
        RestAssured.baseURI = "https://api.trello.com";
    }

    private RequestSpecification requestWithAuth() {
        return RestAssured.given()
                .queryParams(Map.of(
                        "key", "fb04999a731923c2e3137153b1ad5de0",
                        "token", "b73120fb537fceb444050a2a4c08e2f96f47389931bd80253d2440708f2a57e1"
                ));
    }
    
    @Test
    public void checkGetBoards() {
        requestWithAuth()
                .pathParam("member", "learnpostman")
                .get("/1/members/{member}/boards")
                .then()
                .statusCode(200);
    }

    @Test
    public void checkGetBoard() {
        requestWithAuth().pathParam("id", "60d847d9aad2437cb984f8e0")
                .get("/1/boards/{id}")
                .then()
                .statusCode(200)
                .body("name", Matchers.equalTo("New Board"));
    }
}
