package br.com.alura.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class BitcoinResourceTest {

    @Test
    void listar() {

        given()
                .when().get("/bitcoins")
                .then()
                .statusCode(200);
    }
}