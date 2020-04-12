package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseUtil;


public class StepDefinition extends BaseUtil {
private BaseUtil util;
	
	public StepDefinition(BaseUtil util) {
		this.util = util;
	}
	
	private WebDriver driver;
	String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
	
	@Before
	public void setUp() {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/jar/chromedriver");
		 driver = new ChromeDriver();
	}
	
	@Given("login to Tour page")
	@Given("Customer has login to Tour page")
	public void customer_has_login_to_Tour_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    driver.get(baseURL);
	    System.out.format("Thread ID - %2d",Thread.currentThread().getId());
	}

	@When("he enters username and password")
	public void he_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("userName")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("admin");
	    
	}
	
	@When("user enter {string} and {string} with {string}")
	public void user_enter_and(String username, String password, String fullName) {
		util.fullName = fullName;
		
		driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@When("he enter valid credentials")
	public void he_enter_valid_credentials(DataTable table) {
		List<String> tableData = table.asList();
	   
		driver.findElement(By.name("userName")).sendKeys(tableData.get(0));
	    driver.findElement(By.name("password")).sendKeys(tableData.get(1));
	    
	}
	
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).submit();
	}

	@Then("he should see logout link")
	public void he_should_see_logout_link() {
	    
		System.out.println("fullName - " + util.fullName);
		 
        
        Boolean status = driver.findElement(By.partialLinkText("registration")).isDisplayed();
        Assert.assertEquals(true, status);
        
	}

	@After
	public void tearDown() {
		 driver.quit();
	}


}
