package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CustomResourceMethodTest {
    @Test
    public void testCustomGetEntityResource() {
        given().get("/entity/customGet").then().statusCode(HttpStatus.SC_NO_CONTENT);
    }

    @Test
    public void testCustomGetRepositoryResource() {
        given().get("/repository/customGet").then().statusCode(HttpStatus.SC_NO_CONTENT);
    }
}
