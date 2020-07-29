package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SampleTest {
	
	@Given("Sample Test Scenario")
	public void test_scenario1() {
	    
		System.out.println("Sample Scenario Given step");
	}
	
	@When("Sample Scenario1 executed")
	public void scenario1_executed() {
	    
		System.out.println("Sample Scenario When  step");
	}

}
