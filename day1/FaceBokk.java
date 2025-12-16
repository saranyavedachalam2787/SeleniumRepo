package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBokk {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("saranyavedhachalam@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("PranavDeshva@1");
	driver.findElement(By.name("login")).click();
	String title=driver.getTitle();
	System.out.println(title);
	}

}
