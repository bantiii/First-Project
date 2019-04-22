package StepDef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Util.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.Scenario;

public class StepDefinition extends Lib {
	public WebDriver driver;

	// the Second commit is here
	// and from now on I will be writing all my commntes here get the refernce
	// here please thank you n
	@Before
	public void initialize(Scenario scenario) {
		System.out.println("this is before class");
		Lib.scenario = scenario;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bantt\\BootCamp_2018\\chromedriver333.exe");

		// Webdriver is interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.yelp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// this is new Change so make sure you know this
		// and also you are asked to do this okay
	}

	public void tottalValue() {
		System.out.println();
	}

	@Test(priority = 0)
	@Given("^user lands on yelp home page$")
	public void homepage() {
		System.out.println("the title of the page is" + allpagetitle(driver));
		scenario.write(" User on the Home page");
	}

	@Test(priority = 1)
	@Then("^Click on Signup button$")
	public void click_on_signup() throws InterruptedException, IOException {
		WebElement ele = Findelement(driver, readproperties(driver, "sine"));
		ele.click();
	}

	@Test(priority = 2)
	@Then("^user enter \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_all_credential(String key, String value)
			throws InterruptedException, IOException {
		Findelement(driver, readproperties(driver, key)).sendKeys(value);

	}

	@Test(priority = 3)
	@Then("^user select month$")
	public void month() throws InterruptedException, IOException {
		WebElement state = driver.findElement(By
				.xpath("//select[@name='birthdate_m']"));
		Select select = new Select(state);
		select.selectByIndex(3);
		scenario.write("Month Selected Properly");
		// So this is my second editing example of all the time you should know
		// this
	}

	@Test(priority = 4)
	@Then("^user select date$")
	public void day() throws InterruptedException, IOException {
		WebElement state = driver.findElement(By
				.xpath("//select[@name='birthdate_d']"));
		Select select = new Select(state);
		select.selectByIndex(5);
		assert driver.getPageSource().toLowerCase().contains("dateasdfgh");
		scenario.write("user set the Date here");
	}

	@Test(priority = 5)
	@Then("^user select year$")
	public void year() throws InterruptedException, IOException {
		WebElement state = driver.findElement(By
				.xpath("//select[@name='birthdate_y']"));
		Select select = new Select(state);
		select.selectByIndex(23);
		// assert driver.getPageSource().toLowerCase().contains("year");
		Assert.assertTrue(driver.getPageSource().toLowerCase().contains("year"));
		scenario.write("User Select year succesfully");

	}

	@Test(priority = 6)
	@Then("^Click on Signup buttonn$")
	public void click_on_signupp() throws InterruptedException, IOException {
		WebElement ele2 = Findelement(driver,
				readproperties(driver, "SignupTwo"));
		ele2.click();
		scenario.write("User clicked the Sign up button");
		scenario.write("Now the value is correct and all finished successfully!!");
		// Assert.assertTrue(driver.getPageSource().toLowerCase().contains("Sign Up"));
	}

	// to get all this links we have in our web page and print it

	// @Then("^get all links$")
	// public void links() {
	// java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	//
	// System.out.println(links.size());
	//
	// for (int i = 1; i <= links.size(); i = i + 1)
	//
	// {
	//
	// System.out.println(links.get(i).getText());
	// 5
	public void value() {
		System.out.println(" the value will get executed right here");
		System.out
				.println(" the value we have here is not our memeber so you don'n really worry about that Thanks");
	}

	// }
	//
	// }

	// @Then("^user take screenshot$")
	// public void takeScreenShot() throws IOException {
	// takescreenshot(driver, "yelpp");
	// }
	public void totolaValur() {
		System.out.println("== All Automated ==");
	}

	@After()
	public void killBrowser() {
		scenario.write("Finished scenario");
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.BYTES), "image/png");
		}
		driver.close();
		driver.quit();
	}

}
