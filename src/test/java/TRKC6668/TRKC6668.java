package TRKC6668;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TRKC6668 {
	WebDriver driver;
	
  @Test (priority =1)
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Open kc-Avocado-staging.ad.metrogistics.com");
		driver.get("https://kc-avocado-staging.ad.metrogistics.com/");
		driver.manage().window().maximize();
  
  }
  
  
}
