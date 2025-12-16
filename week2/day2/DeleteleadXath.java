package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteleadXath {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click(); 
      Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); 
    
        
        driver.findElement(By.xpath("//span[text()='Phone'] ")).click();
        
        driver.findElement(By.name("phoneNumber")).sendKeys("1000000001");
        
        driver.findElement(By.xpath(" //button[text()='Find Leads'] ")).click();  
        Thread.sleep(3000);
       WebElement ele=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")); 
       String s= ele.getText();
       System.out.println(s);
    ele.click();
        
      driver.findElement(By.className("subMenuButtonDangerous")).click();
      driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); 
        
      driver.findElement(By.xpath("//input[@name='id']")).sendKeys(s);
      
      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();  
      Thread.sleep(3000);
      
      String text = driver.findElement(By.className("x-paging-info")).getText();
      System.out.println(text);
	}

}

