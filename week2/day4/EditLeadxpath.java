package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadxpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click(); 
        
        Thread.sleep(3000);
      
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click(); 
        Thread.sleep(3000);
        
       
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CapGemini");
        
       driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saranya");
       driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vedachalam");
       driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Saran");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computers");
       driver.findElement(By.id("createLeadForm_description")).sendKeys("For Reatil purpose");  
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Retail@gmail.com");
      Select drp=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
      drp.selectByVisibleText("New York");
      
      
      driver.findElement(By.xpath("//input[@name='submitButton']")).click();
      driver.findElement(By.xpath("//a[text()='Edit']")).click();
      
      Thread.sleep(3000);
      driver.findElement(By.xpath("//textarea[text()='For Reatil purpose']")).clear();  
      driver.findElement(By.name("importantNote")).sendKeys("For Business only"); 
      
      
      driver.findElement(By.className("smallSubmit")).click(); 
      
      String title=driver.getTitle();
      System.out.println("Title Page:" +title);
      driver.close();
	}


		
	}


