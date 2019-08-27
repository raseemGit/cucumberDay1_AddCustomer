package cucumebr;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
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
	@And("User Click The Add User")
	public void user_Click_The_Add_User() {
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();  
	}
	
	//Scenario 
	/*@When("User Should Give The valid Detail")
	public void user_Should_Give_The_valid_Detail() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.id("fname")).sendKeys("Mohamed");
		driver.findElement(By.id("lname")).sendKeys("Raseem");
		driver.findElement(By.id("email")).sendKeys("raseem.moha@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9876543321");
		driver.findElement(By.xpath("//input[@name='submit']")).click();  
		}*/
	
	//SCENARIO OUTLINE
	/*@When("User Should Give The valid Detail{string},{string},{string},{string},{string}")
	public void user_Should_Give_The_valid_Detail(String fname, String lname, String email, String address, String phone) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}*/
	
	//ONE DIMENSION <<<LIST>>>
	/*@When("User Should Give The valid Detail")
	public void user_Should_Give_The_valid_Detail(io.cucumber.datatable.DataTable userData) {
	  List<String> li=  userData.asList(String.class);
	  driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.id("fname")).sendKeys(li.get(0));
		driver.findElement(By.id("lname")).sendKeys(li.get(1));
		driver.findElement(By.id("email")).sendKeys(li.get(2));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(li.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(li.get(4));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	}*/
	
	//ONE DIMENSION <<<MAP>>>
	@When("User Should Give The valid Detail")
	public void user_Should_Give_The_valid_Detail(io.cucumber.datatable.DataTable userData) {
		Map<String,String> mp=userData.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.id("fname")).sendKeys(mp.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(mp.get("lname"));
		driver.findElement(By.id("email")).sendKeys(mp.get("email"));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(mp.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(mp.get("phone"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}

	@Then("I validate the customer id Showing or not")
	public void i_validate_the_customer_id_Showing_or_not() {
	Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	    
	}

}
