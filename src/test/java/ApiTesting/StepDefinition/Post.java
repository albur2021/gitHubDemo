package ApiTesting.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Post {


    @Given("Posts Api is running and returning status code {int}")
    public void posts_api_is_running_and_returning_status_code(int int1) {

    }

    @When("Posts Api is able to add a new Post to System with userId2 and title\"Hello Bro!\" and body as well {string}")
    public void posts_api_is_able_to_add_a_new_post_to_system_with_user_id2_and_title_hello_bro_and_body_as_well(String string) {

    }
    @When("System should verify whether a new Post is added")
    public void system_should_verify_whether_a_new_post_is_added() {

    }
    @Then("System is able to Clean up after a new Post was added")
    public void system_is_able_to_clean_up_after_a_new_post_was_added() {

    }
    @Then("System should verify whether the Post was deleted")
    public void system_should_verify_whether_the_post_was_deleted() {

    }

}
