package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Hema");
	driver.findElement(By.name("lastname")).sendKeys("Priya");
	driver.findElement(By.name("reg_email__")).sendKeys("hema7krish@gmail.com");
	
	driver.findElement(By.id("password_step_input")).sendKeys("Sarava@123");
	
	WebElement drop1= driver.findElement(By.name("birthday_day"));
	Select drpdwn1 = new Select(drop1);
	drpdwn1.selectByValue("11");
	
	WebElement drop2= driver.findElement(By.name("birthday_month"));
	Select drpdwn2 = new Select(drop2);
	drpdwn2.selectByVisibleText("May");
	
    WebElement drop3 = driver.findElement(By.name("birthday_year"));
	Select drpdwn3 = new Select(drop3);
	drpdwn3.selectByVisibleText("1996");
	
	driver.findElement(By.className("_8esa")).click();
	
}
}
