package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SampleTest {
	
	@Given("Sample Test Scenario")
	public void test_scenario1() {
	    
		System.out.println("................Sample Scenario Given step");
	}
	
	@When("Sample Scenario1 executed")
	public void scenario1_executed() {
	    
		System.out.println("...........Sample Scenario When  step");
	}
	
	@Then("Post when action executed")
	public void Post_when_action_executed() {
	    
		System.out.println("................Post when action executed Than .");
	}

	@Given("1Sample Test Scenario")
	public void Atest_scenario1() {
	    
		System.out.println("................Sample Scenario Given step");
	}
	
	@When("1Sample Scenario1 executed")
	public void Ascenario1_executed() {
	    
		System.out.println("...........Sample Scenario When  step");
	}
	
	@Then("1Post when action executed")
	public void APost_when_action_executed() {
	    
		System.out.println("................Post when action executed Than .");
	}
}
