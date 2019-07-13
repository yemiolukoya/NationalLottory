package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NationalLottory.NationalLottory.BaseClass;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OpenAccountPage;

public class OpenAccount extends BaseClass {

	private WebDriver driver;

	private OpenAccountPage op;

	@Before

	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		op = new OpenAccountPage(driver);
	}

	@Given("^the user is on the National lottory website$")
	public void the_user_is_on_the_National_lottory_website() throws Throwable {
		driver.get("https://www.national-lottery.co.uk/");

	}

	@When("^the user click open account$")
	public void the_user_click_open_account() throws Throwable {
		op.clickOpenAccountLink();

	}

	@When("^fill in valid credentials on step (\\d+) of (\\d+) page$")
	public void fill_in_valid_credentials_on_step_of_page(int arg1, int arg2) throws Throwable {

	}

	@Then("^click open account$")
	public void click_open_account() throws Throwable {

	}

	@Then("^We couldn't confirm your details message is displayed$")
	public void we_couldn_t_confirm_your_details_message_is_displayed() throws Throwable {

	}

	@When("^fill in valid credentials on first page$")
	public void fill_in_valid_credentials_on_first_page() throws Throwable {

		op.selectTitle();
		op.enterFirstName("Yemi");
		op.enterLastName("Test");
		op.selectDayOfBirth("4");
		op.selectMonthOfBirth("Jan");
		op.selectYearOfBirth("1980");
		op.enterEmailAddressField("yemmie69@yahoo.com");
		op.enterEmailAddressConfirmField("yemmie69@yahoo.com");
		op.enterHouseNumber("26");
		op.enterPostcode("se156fg");
		op.clickFindAddressTab();
		driver.findElement(By.cssSelector("#journey_save")).click();
		op.clickNextTab();
		op.enterPassWordField("Qwertyuiop69");
		op.selectSecurityQuestion();
		op.enterSecurityAnswer("olukoya");

	}

	@When("^fill in valid credentials on second page$")
	public void fill_in_valid_credentials_on_second_page() throws Throwable {

	}

}
