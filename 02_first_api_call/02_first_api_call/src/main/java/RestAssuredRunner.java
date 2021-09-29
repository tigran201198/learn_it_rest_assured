import io.restassured.RestAssured;

public class RestAssuredRunner {
    public static void main(String[] args) {
        RestAssured.given()
                .log().all()
                .baseUri("https://api.trello.com")
                .get();
    }
}
