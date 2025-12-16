package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Saran");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sathee");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2787168622");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Chennai@Dec2025");
		
		Select drp=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		drp.selectByVisibleText("20");   
		
		Select drp3=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		drp3.selectByVisibleText("Nov"); 
		
		Select drp2=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		drp2.selectByVisibleText("2018");
		
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
	}

}
