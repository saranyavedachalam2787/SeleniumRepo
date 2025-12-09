package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leads {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharanya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vedhachalam");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TeamDetails");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title); 
	}

}
