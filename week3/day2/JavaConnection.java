package week3.day2;

public class JavaConnection implements DataConnection{

	@Override
	public void connect()
	{
	System.out.println("Data connected Successfully");

	}

	@Override
	public void disconnect() {
		System.out.println("Data disconnected Successfully");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println(	"Data executed and updated Successfully");
	}
	
	
	public static void main(String[] args) 
	{
		
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
				
	}


	
}
