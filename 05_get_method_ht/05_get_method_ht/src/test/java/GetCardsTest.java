import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class GetCardsTest {

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
    public void checkGetCards() {
        requestWithAuth()
                .pathParam("list_id", "60d84769c4ce7a09f9140221")
                .get("/1/lists/{list_id}/cards")
                .then()
                .statusCode(200);
    }

    @Test
    public void checkGetCard() {
        requestWithAuth()
                .pathParam("id", "60e03f8328428d54e3f62252")
                .get("/1/cards/{id}")
                .then()
                .statusCode(200)
                .body("name", Matchers.equalTo("Test card"));
    }
}
