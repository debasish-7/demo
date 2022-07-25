
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://sanbox.undostres.com.mx");
		driver.findElement(By.name("mobile")).sendKeys("8465433546");
		driver.findElement(By.className("action")).click();
		driver.findElement(By.linkText("Telcel")).click();
		driver.findElement(By.className("data-value")).click();
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("Tarjeta")).click();
		driver.findElement(By.className("radio-custom-label")).click();
		driver.findElement(By.className("radio-custom-label")).click();
		driver.findElement(By.linkText("Usar nueva tarjeta")).click();
		driver.findElement(By.linkText("Usar nueva tarjeta")).click();
		driver.findElement(By.id("cardnumberunique")).sendKeys("4111111111111111");
		driver.findElement(By.cssSelector("input[placeholder='mes']")).sendKeys("11");
		driver.findElement(By.name("expyear")).sendKeys("25");
		driver.findElement(By.name("cvvno")).sendKeys("111");
		driver.findElement(By.name("txtemail")).sendKeys("test@test.com");
		driver.findElement(By.className("PaymentMethod")).click();
		driver.findElement(By.className("email")).sendKeys("automationexcersise@test.com");
		driver.findElement(By.id("psw")).sendKeys("123456");
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		driver.findElement(By.name("loginBtn")).click();	

	}

}
