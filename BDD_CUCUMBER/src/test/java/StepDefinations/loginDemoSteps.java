package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class loginDemoSteps 
{
	static WebDriver driver;
	String url="https://example.testproject.io/web/";
	
	@Given("Browser is opened1")
	public void browser_is_opened1() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(200, 200));
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user is in login page1")
	public void user_is_in_login_page1() 
	{
		String Title = driver.getTitle();
	    System.out.println("User is in" +Title);
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password1(String username,String password1) 
	{
	    driver.findElement(By.id("name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password1);
	}
	
	@And("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    driver.findElement(By.xpath("//button[@id='login']")).click();
	}

	@Then("user is navigated to homepage1")
	public void user_is_navigated_to_homepage1() 
	{
		Boolean logout=driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();
		System.out.println(logout);
		String Title = driver.getTitle();
	    System.out.println("User is in" +Title);
	    driver.quit();
	}

}
