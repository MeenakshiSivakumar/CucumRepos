package cucupackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NEwClass {
	WebDriver driver;
	
	
	@Given("User wants to open the Test Me App")
public void user_wants_to_open_the_Test_Me_App() {
		System.setProperty("webdriver.chrome.driver","C:\\Meenakshi\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}
	

@Given("user has to sign up the app")
public void user_has_to_sign_up_the_app() {
	driver.findElement(By.linkText("SignUp")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("User fill the username as {string}")
public void user_fill_the_username_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	System.out.println("Username is" +string);
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
}

@Then("user fill the firstname as {string}")
public void user_fill_the_firstname_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Firstname is" +string);
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);


}

@Then("user enter the lastname as {string}")
public void user_enter_the_lastname_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Lastname is" +string);
	driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string);


}

@Then("user enters the password as {string}")
public void user_enters_the_password_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Password is" +string);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);

}

@When("user confirms the password as {string}")
public void user_confirms_the_password_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Confirmed Password is" +string);
	driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);;

}

@When("user enter the gender as {string}")
public void user_enter_the_gender_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Gender is" +string);
	driver.findElement(By.xpath("//input[@value='Female']")).click();

}

@When("user enter the email id {string}")
public void user_enter_the_email_id(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Email id is" +string);
	driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);

}

@Then("userr has to enter the mobile number {string}")
public void userr_has_to_enter_the_mobile_number(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Mobile no is" +string);
	driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);

}

@When("user click the image")
public void user_click_the_image() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
    	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();

}

@Then("user enter the month {string}")
public void user_enter_the_month(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[12]"));

}

@Then("user enter the date {string}")
public void user_enter_the_date(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a"));

}

@Then("user enter the year {string}")
public void user_enter_the_year(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[47]"));

}


/*@Then("user enter the dob {string}\\/{string}\\/{string}")
public void user_enter_the_dob(String string1,String string2,String string3) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("dob is"+string1+"/"+string2+"/"+string3);
	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[12]")).sendKeys(string1);
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).sendKeys(string2);
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[47]")).sendKeys(string3);*/
	  


@Then("user enters the address as {string}")
public void user_enters_the_address_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Address is" +string);
	driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);

}

@Then("user must select security questions as {string}")
public void user_must_select_security_questions_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Sec ques  is" +string);
	driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).sendKeys(string);

}

@Then("user answered for the security questions as {string}")
public void user_answered_for_the_security_questions_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Sec ans  is" +string);
	driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);

}

@Then("click the register button")
public void click_the_register_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

}
}