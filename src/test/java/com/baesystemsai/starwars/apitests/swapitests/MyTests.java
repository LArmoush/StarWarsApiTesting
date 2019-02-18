package com.baesystemsai.starwars.apitests.swapitests;

import com.baesystemsai.starwars.serentiy.CommonSerenitySteps;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class MyTests
{
    @Steps
    private CommonSerenitySteps commonSerenitySteps;

    @Test
    public void test001(){

        Response response = commonSerenitySteps
                .submitGetRequestToAnEndpoint("http://localhost:8080/yoda");

        response.body().prettyPrint();
    }

}
