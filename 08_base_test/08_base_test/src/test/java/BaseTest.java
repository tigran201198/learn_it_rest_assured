import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

import java.util.Map;

public class BaseTest {

    @BeforeAll
    public static void setBaseUrl() {
        RestAssured.baseURI = "https://api.trello.com";
    }

    protected RequestSpecification requestWithAuth() {
        return requestWithoutAuth()
                .queryParams(Map.of(
                        "key", "fb04999a731923c2e3137153b1ad5de0",
                        "token", "b73120fb537fceb444050a2a4c08e2f96f47389931bd80253d2440708f2a57e1"
                ));
    }

    protected RequestSpecification requestWithoutAuth() {
        return RestAssured.given();
    }
}
