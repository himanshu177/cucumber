package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_new {
	

    WebDriver we;
@Given("^User is on Home Page$")
public void user_is_on_Home_Page()  {
	  System.setProperty("webdriver.gecko.driver","/home/administrator/Desktop/geckodriver");
      we=new FirefoxDriver();
      we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
   
}

@When("^User navigate to Login Page$")
public void user_navigate_to_Login_Page()  {
	 we.get("http://127.0.0.1:8080/apex/");
}

@When("^User enters Username and Password and login button$")
public void user_enters_Username_and_Password_and_login_button()  {
	 we.findElement(By.name("p_t01")).sendKeys("him");
     we.findElement(By.name("p_t02")).sendKeys("2424him");
     we.findElement(By.id("LOGIN")).click();
     we.findElement(By.linkText("Logout")).click();
     we.close();
   
}

@Then("^Message Displayed Login Sucessfull$")
public void message_Displayed_Login_Sucessfull()  {
	 System.out.println("Sucessfull Login");
    
}

}
