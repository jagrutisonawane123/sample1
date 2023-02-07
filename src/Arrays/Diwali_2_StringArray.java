package Arrays;

public class Diwali_2_StringArray 
{
	public static void main(String[] args) {
		
	
	String[] ar=new String[4];
			
			ar[0]="Raj";
	        ar[1]="anu";
	        ar[2]="Ruhi";
			ar[3]="Cinu";
			ar[4]="komal";
			
			
			System.out.println(ar[2]);
			System.out.println(ar.length);
			
			System.out.println("----print all data-----");
			
			for(int i=0;i<=ar.length-1;i++)
			{
				System.out.println(ar[i]);
			}
			
	}
}
