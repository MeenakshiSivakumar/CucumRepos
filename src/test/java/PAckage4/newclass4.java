package PAckage4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;


public class newclass4 {
WebDriver driver;

@Given("search the functionality by entering {int} characters")
public void search_the_functionality_by_entering_characters(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Meenakshi\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
}

@Given("enter the find details")
public void enter_the_find_details() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("head");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	
}

@Given("click the add to cart button")
public void click_the_add_to_cart_button() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
}
@Given("alex checks for login page")
public void alex_checks_for_login_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	Assert.assertEquals("Login",driver.getTitle());
	System.out.println("Passed");
}
}