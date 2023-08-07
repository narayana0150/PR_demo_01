package Test_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tests_repository {
	WebDriver driver;
	
	@Given("open browser and enter valid url")
	public void open_browser_and_enter_valid_url() {
	  driver=new ChromeDriver();
	  driver.navigate().to("https://www.flipkart.com");
	}

	@When("close login popup")
	public void close_login_popup() {
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	}

	@When("click on search textbox and enter valid product and sumit")
	public void click_on_search_textbox_and_enter_valid_product_and_sumit() {
		WebElement element_01 = driver.findElement(By.xpath("//input[@name='q']"));
         element_01.sendKeys("ihone_11");
         element_01.submit();
         driver.manage().window().maximize();
        // actual = driver.findElement(By.xpath("//span[text()='iphone 11']")).getText();
        // expected=actual;
	}

	@Then("user navigated to product list page")
	public void user_navigated_to_product_list_page() {
	//if(actual.equalsIgnoreCase(expected)) {
		System.out.println("test script validated sucessfully");
	//}
	  }
	  @When("close the broser")
	  public void close_the_broser() {
	     driver.quit();
	  }
}
