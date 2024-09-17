package com.getnet.apitests;

import com.getnet.basetest.BaseTest;
import com.getnet.domain.User;
import com.getnet.factory.UserFactory;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRequestTests extends BaseTest {

    @Test
    @DisplayName("Create user with sucess")
    void createUserRequestTest() {
        User user = UserFactory.createFakeUser();

        Response response = RestAssured
                .given()
                .when()
                .header("Content-Type", "application/json")
                .body(user)
                .post("/api/users");

        JsonPath body = response.jsonPath();
        assertThat(body.getString("name")).isEqualTo(user.getName());
        assertThat(body.getString("job")).isEqualTo(user.getJob());
        assertThat(body.getString("id")).isNotNull();
        assertThat(body.getString("createdAt")).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(201);

    }

    @Test
    @DisplayName("Create user without name")
    void createUserWithoutNameRequestTest() {
        User user = UserFactory.createUserWithoutName();

        Response response = RestAssured
                .given()
                .when()
                .header("Content-Type", "application/json")
                .body(user)
                .post("/api/users");

        JsonPath body = response.jsonPath();
        assertThat(body.getString("name")).isNull();
        assertThat(body.getString("job")).isEqualTo(user.getJob());
        assertThat(body.getString("id")).isNotNull();
        assertThat(body.getString("createdAt")).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(201);
    }


    @Test
    @DisplayName("Create user without Job")
    void createUserWithoutJobRequestTest() {
        User user = UserFactory.createUserWithoutJob();

        Response response = RestAssured
                .given()
                .when()
                .header("Content-Type", "application/json")
                .body(user)
                .post("/api/users");

        JsonPath body = response.jsonPath();
        assertThat(body.getString("name")).isEqualTo(user.getName());
        assertThat(body.getString("job")).isNull();
        assertThat(body.getString("id")).isNotNull();
        assertThat(body.getString("createdAt")).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(201);
    }



}
