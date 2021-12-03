package ApiTesting.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class UserStepDef {
    String apiUrl = "https://jsonplaceholder.typicode.com/users";
    Response apiResponse;
    @Given("System calls user api with valid url")
    public void system_calls_user_api_with_valid_url() {

        apiResponse = given().when().get(apiUrl);
    }
    @When("User api return response with status code {int}")
    public void user_api_return_response_with_status_code(Integer statusCode) {
       int apiResponseCode= apiResponse.thenReturn().statusCode();
        System.out.println(apiResponseCode);
    }
    @Then("System should validate api response")
    public void system_should_validate_api_response() {
        for(int i=0;i<10;i++){
            apiResponse.then().body("id["+ i + "]",is(i +1));
        }
    apiResponse.then().body("name[0]",is("Leanne Graham"));


    }
}
