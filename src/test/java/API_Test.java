import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class API_Test {

    @Test
    public void verifyThatFieldNameHasCorrectValue() {
        given()
                .when()
                .get("https://swapi.dev/api/starships/9/")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .body("name", equalTo("Death Star"));
    }
}