package com.baesystemsai.starwars.serentiy;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CommonSerenitySteps
{
    @Step("Submit a GET request to '{0}' endpoint")
    public Response submitGetRequestToAnEndpoint(String endpoint){

        //send a GET request to an endpoint
        return SerenityRest
                .rest()
                .given()
                .when()
                .get(endpoint);
    }
}
