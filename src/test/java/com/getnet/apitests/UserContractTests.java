package com.getnet.apitests;

import com.getnet.basetest.BaseTest;
import com.getnet.domain.User;
import com.getnet.factory.UserFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class UserContractTests extends BaseTest {

    @Test
    @DisplayName("Validate Json Schema User")
    void createUserRequestTest() {
        User user = UserFactory.createFakeUser();

        given()
                .header("Content-Type", "application/json")
                .body(user)
                .when()
                .post("/api/users")
                .then()
                .body(matchesJsonSchemaInClasspath("schemas/userCreated.json"));

    }

}
