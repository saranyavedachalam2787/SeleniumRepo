package week3.day2;

public class Overloadings {
	
	public void reportStep(String msg, String status )
	{
	System.out.println("Print message: "+ msg);

	}
	public void reportStep(String msg, String status,boolean snap)
	{
	System.out.println("Print message: "+ msg);
	System.out.println("Print message: "+ status);
	System.out.println("Print message: "+ snap);
	
        }

	public static void main(String[] args) {
		Overloadings reprt=new Overloadings();
		  reprt.reportStep("Login successful", "PASS");
	        reprt.reportStep("Home page loaded", "PASS", true);
	}

}
