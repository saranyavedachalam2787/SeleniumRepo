package week2.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		int Count=0;
		String txt="We learn Java basics as part of java sessions in java week1";
		String [] text= txt.split(" ");
		for(int i=0; i<=text.length; i++)
		{
			for(int j=i+1; j<text.length; j++)
			{
			if(text[i].equalsIgnoreCase(text[j]))
			{
				text[j] = ""; 
				 Count++;
			}
			}
			
			
		}
		if (Count > 0)
		{
            for (String s : text) 
            {
                System.out.print(s+ " ");
	
	}

}
	}
}

