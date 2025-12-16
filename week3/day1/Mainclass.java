package week3.day1;

public class Mainclass {

	public static void main(String[] args) {
		
		TestData test=new TestData();
		test.enterCredentials();
		test.navigateToHomePage();
		LoginTestData login=new LoginTestData();
		login.enterUsername();
		login.enterPassword();
	}

}
