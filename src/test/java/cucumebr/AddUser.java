package cucumebr;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddUser {
	static WebDriver driver;
	@Given("User Should Launch The Browser")
	public void user_Should_Launch_The_Browser() {
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpace\\cucumebr\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	    }
	@Given("User Click The Add User")
	public void user_Click_The_Add_User() {
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();  
	}

	@When("User Should Give The valid Detail")
	public void user_Should_Give_The_valid_Detail() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.id("fname")).sendKeys("Mohamed");
		driver.findElement(By.id("lname")).sendKeys("Raseem");
		driver.findElement(By.id("email")).sendKeys("raseem.moha@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9876543321");
		driver.findElement(By.xpath("//input[@name='submit']")).click();  
		}
	@Then("I validate the customer id Showing or not")
	public void i_validate_the_customer_id_Showing_or_not() {
	Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	    
	}

}
