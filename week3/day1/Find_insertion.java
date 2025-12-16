package week3.day1;

public class Find_insertion {

	public static void main(String[] args) {
		
		 int a[]={3,2,11,4,6,7}; 
         int b[]={1,2,8,4,9,7}; 
         
         //i=index,j=index
        
		for(int i = 0;i<a.length;i++)
         {
        	 
			for(int j = 0;j<b.length;j++)
        	 {
        		 if(a[i]==b[j])
        		 {
        			 System.out.println("The matching array is " +  a[i]);
        		 }
        	 }
        	 
         }
		

	}

}
