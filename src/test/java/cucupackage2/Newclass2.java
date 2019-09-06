package cucupackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Newclass2 {
	WebDriver driver;

@Given("user wants to open the app")
public void user_wants_to_open_the_app() {
	System.setProperty("webdriver.chrome.driver","C:\\Meenakshi\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("user click sign in")
public void user_click_sign_in() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
}

@Given("user wants to enter the {string}")
public void user_wants_to_enter_the(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Username is" +string);
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);;
}

@Then("user enter the {string}")
public void user_enter_the(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Password is" +string);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);;


}

@Then("press the login button")
public void press_the_login_button(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}
}
	
	