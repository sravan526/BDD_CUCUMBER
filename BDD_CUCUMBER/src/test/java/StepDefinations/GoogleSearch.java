package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch 
{
	static WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() 
	{
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   //driver.navigate().to(null)
	   driver.manage().window().maximize();
	}

	@And("User is google serach page")
	public void user_is_google_serach_page() 
	{
	    String Title = driver.getTitle();
	    System.out.println("User is in" +Title);
	   
	}

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() 
	{
	    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone");
	    System.out.println("user enter text in search box");
	   
	}

	@And("hits enter button")
	public void hits_enter_button() 
	{
	    WebElement serchButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
	    serchButton.click();
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() 
	{
	    List<WebElement> Links = driver.findElements(By.xpath("/a"));
	    System.out.println("the links is"+Links.size());
	    int x;
	    if(Links.size()>0)
	    {
	    	for(x=0;x<Links.size();x++)
	    	{
	    		
				System.out.println(Links.get(x).getText());
	    	}
	    }
	   driver.quit();
	}

}
