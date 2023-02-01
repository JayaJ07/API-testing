package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^Open chrome and launch the application$")
	public void open_chrome_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
        
        
        
        try {
        	 System.setProperty("webdriver.chrome.driver","J:\\Seleium_Essentials\\chromedriver_win32\\chromedriver.exe");
      	   
     	    WebDriver driver = new ChromeDriver();
     	   
             driver.get("http://www.google.com");
             
  		} catch (Exception e) {
  			 throw new PendingException();// TODO: handle exception
  		}
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	  try {
		  System.out.println("Executing enter_username_and_password");
		} catch (Exception e) {
			 throw new PendingException();// TODO: handle exception
		}
	
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    try {
	    	 System.out.println("Execute reset_the_credential");
		} catch (Exception e) {
			 throw new PendingException();// TODO: handle exception
		}
	   
	}	

}
