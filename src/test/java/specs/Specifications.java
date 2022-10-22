package specs;

import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {

    public static RequestSpecification baseRequestSpec = with()
        .log().all()
        .log().body()
        .contentType(JSON);

    public static ResponseSpecification baseResponseSpec = new ResponseSpecBuilder()
        .log(LogDetail.STATUS)
        .log(LogDetail.ALL)
        .expectStatusCode(200)
        .build();
}
