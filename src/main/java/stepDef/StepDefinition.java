package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {

    @Given("I login into the AEM login page")
    public void i_login_into_the_aem_login_page() {
        System.out.println("Hello");
    }
    @Then("^I navigate to the (macys|bloomingdales) in (Domestic|Registry|IShip) mode for (HomePage|Catsplash|Browse|Subsplash|DLP|SLP) to the authoring page")
    public void I_navigate_to_authoring_page(String brand, String mode, String page) throws Throwable{
        System.out.println("Hello");
    }

    @Then("I add \"([^\"]*)\" Component as (root_container|top_container|container|bottom_container) to the page")
    public void I_add_component_to_Page(String component, String containerType) {
    }

    @Then("I configure \"([^\"]*)\" the Component in the page")
    public void I_configure_the_component(String component) {
    }

    @Then("I configure the page to (HomePage|Catsplash|Browse|Subsplash|DLP|SLP) canvas")
    public void I_configure_the_Canvas(String pageType) {
    }

    @Then("I publish the authored page")
    public static void I_Publish_The_page() {
    }

    @Then("I validate \"([^\"]*)\" configured (root_container|top_container|container|bottom_container) component with AEM publish Response")
    public static void IValidatePublishResponse(String component,String containerType){
    }

    @Then("I delete the created AEM Page")
    public static void I_Delete_The_Created_AEM_Page(){

    }

    @Then("I add {string} Component as root_container to the page")
    public void i_add_component_as_root_container_to_the_page(String string) {

        System.out.println("Hello");

        // Write code here that turns the phrase above into concrete actions
    }

    }