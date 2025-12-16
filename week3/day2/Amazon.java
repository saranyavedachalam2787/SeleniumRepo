package week3.day2;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() 
	{
		System.out.println("cash On Delivery selected");
		
	}

	@Override
	public void upiPayments() 
	{
	
		System.out.println("upiPayments selected");
	}

	@Override
	public void cardPayments()
	{
		System.out.println("cardPayment selected");
		
	}

	@Override
	public void internetBanking()
	{
		
		System.out.println("internetBanking selected");
	}
	public static void main(String[] args)
	{
		Amazon amz=new Amazon();
		amz.cashOnDelivery();
		amz.cardPayments();
		amz.upiPayments();

	}

}
