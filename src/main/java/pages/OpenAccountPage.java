package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage {
	JavascriptExecutor executor;

	WebDriver driver;

	@FindBy(id = "register_link")
	private WebElement OpenAccountLink;

	@FindBy(id = "form_title")
	private WebElement TitleDropDown;

	@FindBy(id = "form_firstName")
	private WebElement FirstNameField;

	@FindBy(id = "form_lastName")
	private WebElement LastNameField;

	@FindBy(id = "form_dateOfBirth_day")
	private WebElement DayOfBirthDropdown;

	@FindBy(id = "form_dateOfBirth_month")
	private WebElement MonthOfBirthDropdown;

	@FindBy(id = "form_dateOfBirth_year")
	private WebElement YearOfBirthDropdown;

	@FindBy(id = "form_emailAddress")
	private WebElement EmailAddressField;

	@FindBy(id = "form_emailAddressConfirm")
	private WebElement EmailAddressConfirmField;

	@FindBy(id = "form_house")
	private WebElement HouseNoField;

	@FindBy(id = "form_postCode")
	private WebElement PostCodeField;

	@FindBy(id = "post_code_lookup_submit")
	private WebElement FindAddressTab;

	@FindBy(id = "journey_save")
	private WebElement NextTab;

	@FindBy(id = "form_password")
	private WebElement CreatePassWordField;

	@FindBy(id = "form_securityQuestionId")
	private WebElement SecurityQuestionDropDown;

	@FindBy(id = "form_form_security_answer")
	private WebElement SecurityAnswer;

	@FindBy(id = "form_communications_yes")
	private WebElement YesPreferencesTab;

	@FindBy(id = "form_communications_no")
	private WebElement NoPreferencesTab;

	//@FindBy(css = "#journey_save")
	//private WebElement CreatAccountTab;

	public OpenAccountPage(WebDriver driver) {

		this.driver = driver;
		this.executor = (JavascriptExecutor) this.driver;

		PageFactory.initElements(driver, this);

	}

	public void clickOpenAccountLink() {
		// OpenAccountLink.click();

		executor.executeScript("arguments[0].click();", OpenAccountLink);

	}

	public void selectTitle() {
		Select TitleDrpdown = new Select(TitleDropDown);
		TitleDrpdown.selectByIndex(2);

	}

	public void enterFirstName(String firstName) {
		FirstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		LastNameField.sendKeys(lastName);
	}

	public void selectDayOfBirth(String day) {
		Select dayOfBirth = new Select(DayOfBirthDropdown);
		dayOfBirth.selectByVisibleText(day);
	}

	public void selectMonthOfBirth(String month) {
		Select monthOfBirth = new Select(MonthOfBirthDropdown);
		monthOfBirth.selectByVisibleText(month);
	}

	public void selectYearOfBirth(String year) {
		Select yearOfBirth = new Select(YearOfBirthDropdown);
		yearOfBirth.selectByVisibleText(year);
	}

	public void enterEmailAddressField(String email) {
		EmailAddressField.sendKeys(email);
	}

	public void enterEmailAddressConfirmField(String confirmEmail) {
		EmailAddressConfirmField.sendKeys(confirmEmail);
	}

	public void enterHouseNumber(String number) {
		HouseNoField.sendKeys(number);

	}

	public void enterPostcode(String postcode) {
		PostCodeField.sendKeys(postcode);
	}

	public void clickFindAddressTab() {
		FindAddressTab.click();

	}

	public void clickNextTab() {
	// NextTab.click();

	executor.executeScript("arguments[0].click();",NextTab);

}

	public void enterPassWordField(String password) {
		CreatePassWordField.sendKeys(password);
	}

	public void selectSecurityQuestion() {

		Select SecurityQuestion = new Select(SecurityQuestionDropDown);

		SecurityQuestion.selectByIndex(2);
	}

	public void enterSecurityAnswer(String answer) {
		SecurityAnswer.sendKeys(answer);

	}

	public void clickYesPreferencesTab() {
		YesPreferencesTab.click();
	}

	public void clickNoPreferencesTab() {
		NoPreferencesTab.click();

	}

	public void clickCreatAccountTab() {
		//CreatAccountTab.click();
	}
}
