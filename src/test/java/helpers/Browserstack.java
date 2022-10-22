package helpers;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;
import static specs.Specifications.baseRequestSpec;
import static specs.Specifications.baseResponseSpec;

import config.mobile.BrowserStack;

public class Browserstack {
    public static String videoUrl (String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        String login = BrowserStack.config.login();
        String password = BrowserStack.config.password();

        return given()
            .spec(baseRequestSpec)
            .auth().basic(login, password)
            .when()
            .get(url)
            .then()
            .spec(baseResponseSpec)
            .extract()
            .path("automation_session.video_url");
    }
}
