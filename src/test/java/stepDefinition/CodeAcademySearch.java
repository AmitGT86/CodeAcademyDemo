

package stepDefinition;

//import io.cucumber.java.en.*;

//import org.junit.Assert;
import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;



public class CodeAcademySearch {

 static WebDriver driver = null;
 

 @Given("browser is open")
	public void browser_is_open() {
		// Initiate the Chrome-driver and open the browser.
		System.setProperty("webdriver.chrome.driver", "/Users/amitbarua/Downloads/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}



 @And("User goes to Codeacademy page")
 public void user_is_on_google_search_page() {
  // Navigate to google.com
  driver.navigate().to("https://www.codecademy.com/");
 }


 @When("User enters a text in a search box")
 public void user_enters_a_text_in_a_search_box() {
  // In the google search box, enter any text - Say "Cucumber Test"
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/header/nav[1]/div/ul/li[8]/button")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//*[@id=\"header-search-bar\"]")).sendKeys("Python"); 
	 try {
         Thread.sleep(5000); // 5000 milliseconds = 5 seconds
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
	 driver.findElement(By.xpath("//*[@id=\"header-search-bar\"]")).sendKeys(Keys.ENTER);
 }

 @And("User waits {int} seconds")
	public static void user_wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
 /*@And("hits Enter")
 public void hits_enter() {
 // Simulate the clicking of enter key
 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
 }
*/

 @Then("User is navigated to result")
 public void user_is_navigated_to_search_feature() {
 // The test case should pass if the resulting page 
 // contains an expected text - Say ""What is Cucumber Test"
 
 if (driver.getPageSource().contains("Learn Python 3")) {
	    System.out.println(" RESULT : Element is present");
	} else {
	    System.out.println(" RESULT : Element is not present");
	}
 // Finally, closing driver after test is complete
   //driver.close(); 
 
 }
 
 @And("User checks for {int} seconds")
	public static void user_check(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 driver.close();
	}
 
}
