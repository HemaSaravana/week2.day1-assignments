package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Hema");
		driver.findElement(By.name("UserLastName")).sendKeys("Saravana");
		driver.findElement(By.name("UserEmail")).sendKeys("Hemasaravana@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("90849327498");

		WebElement drop1 = driver.findElement(By.name("UserTitle"));
		Select drpDwn1 = new Select(drop1);
		drpDwn1.selectByVisibleText("IT Manager");
		
		WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByValue("950");
		
		WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByVisibleText("Italy");
		driver.findElement(By.className("checkbox-ui")).click();
	    driver.close();

	}

}
