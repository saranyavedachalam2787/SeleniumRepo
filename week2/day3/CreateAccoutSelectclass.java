package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccoutSelectclass {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	ChromeDriver driver=new ChromeDriver(opt);
	driver.get("http://leaftaps.com/opentaps/."); 

	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Saranya");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	
	WebElement industry=driver.findElement(By.name("industryEnumId")) ;
	Select indusselect1=new Select(industry);
	indusselect1.selectByVisibleText("Computer Software");
	
	Select select=new Select(driver.findElement(By.name("ownershipEnumId")));
	select.selectByVisibleText("S-Corporation");
	Thread.sleep(5000);
	Select selectvalue=new Select(driver.findElement(By.id("dataSourceId")));
	selectvalue.selectByValue("LEAD_EMPLOYEE");
	
	Select selecindx=new Select(driver.findElement(By.id("marketingCampaignId")));
	selecindx.selectByIndex(6);
	
	Select selectval1=new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
	selectval1.selectByValue("TX");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String title=driver.getTitle();
	System.out.println("AccountCreatedSuccessfully"+title);
	driver.close();
	}
	

   
  

	}




