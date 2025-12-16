package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int count=0;
		int n = 11;
		for(int i = 2; i<n-1; i++)
		{
			if(n % i==0)
			count++;
				
}
		if(count==2)
		{
		
				System.out.println(  " is prime");
			}
			else 
			{
				System.out.println( " is Not a prime");
			}
		

	}

}
