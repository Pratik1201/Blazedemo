package blazeDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://blazedemo.com");
		System.out.println(driver.getTitle());
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s1 =  new Select(dropdown1);
		s1.selectByVisibleText("Mexico City"); 
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s2 = new Select(dropdown2);
		s2.selectByVisibleText("New York");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();
		driver.findElement(By.id("inputName")).sendKeys("Sumit S");
		driver.findElement(By.id("address")).sendKeys("At mandava near kerala mumbai");
		driver.findElement(By.cssSelector("#city")).sendKeys("Mandava");
		driver.findElement(By.id("state")).sendKeys("Maharashtra");
		driver.findElement(By.id("zipCode")).sendKeys("143143");
		WebElement cardType = driver.findElement(By.id("cardType"));
		Select s3 = new Select(cardType);
		s3.selectByVisibleText("American Express");
		driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("546385271477");
		
		
		
	}

}
