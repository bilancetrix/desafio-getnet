package com.getnet.basetest;


import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    void setUp() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
//        Caso queira rodar com todos os logs
//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://reqres.in";
    }
}
