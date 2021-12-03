package ApiTesting.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ApiTest {
    static String urlName = "https://jsonplaceholder.typicode.com/users/";
    static Response response;
    @Given("User sets the base api request url")
    public void user_sets_the_base_api_request_url() {
         response =  given().when().get(urlName);


    }
    @When("User sends the api request to get all the data")
    public void user_sends_the_api_request_to_get_all_the_data() {
        response.thenReturn().body()
                .prettyPrint();
    }
    @Then("User validates the response the status code")
    public void user_validates_the_response_the_status_code() {
            response.then().assertThat().statusCode(200).log().status();
    }
}
