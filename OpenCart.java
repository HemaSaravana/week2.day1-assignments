package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("input-username")).sendKeys("HemaSaravana123");
		driver.findElement(By.id("input-firstname")).sendKeys("Hema");
		driver.findElement(By.id("input-lastname")).sendKeys("M");
		driver.findElement(By.id("input-email")).sendKeys("hemasaravana@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("dfghjk1223");
		
		WebElement drop1 = driver.findElement(By.id("input-country"));
		Select drpDwn1 = new Select(drop1);
		drpDwn1.selectByVisibleText("India");
		
	}
		
	}	


