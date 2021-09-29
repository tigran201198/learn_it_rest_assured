package tests.update;

import consts.CardsEndpoints;
import consts.UrlParamValues;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

import java.time.LocalDateTime;
import java.util.Map;

public class UpdateCardTest extends BaseTest {

    @Test
    public void checkUpdateBoard() {
        String updatedName = "Updated Card" + LocalDateTime.now();
        requestWithAuth()
                .pathParam("id", UrlParamValues.CARD_ID_TO_UPDATE)
                .body(Map.of("name", updatedName))
                .contentType(ContentType.JSON)
                .put(CardsEndpoints.UPDATE_CARD_URL)
                .then()
                .statusCode(200)
                .body("name", Matchers.equalTo(updatedName));
        requestWithAuth()
                .pathParam("id", UrlParamValues.CARD_ID_TO_UPDATE)
                .get(CardsEndpoints.GET_CARD_URL)
                .then()
                .body("name", Matchers.equalTo(updatedName));
    }
}
