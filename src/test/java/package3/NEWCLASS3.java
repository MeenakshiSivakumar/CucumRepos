package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class NEWCLASS3 {
WebDriver driver;

@Given("Alex want to open the app")
public void alex_want_to_open_the_app() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Meenakshi\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
}

@Given("Search the functionality by entering {int} characters")
public void search_the_functionality_by_entering_characters(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("head");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    	//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4"));
}


}
