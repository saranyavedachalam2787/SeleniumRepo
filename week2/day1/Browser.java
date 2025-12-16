package week2.day1;

public class Browser {
	
	String launchBrowser(String browserName) {
		System.out.println(browserName +  "loaded successfully");
		return(browserName);
		
		
	}
	void loadURL()
	{
		System.out.println("URL loaded successfully");
	}
	

	public static void main(String[] args) 
	{
		Browser b=new Browser();
		b.launchBrowser("Chrome");
		b.loadURL();
	}

}
