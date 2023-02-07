package Arrays;

public class Diwali_7_StringArray_Dec_OnlySingleStep 
{
	public static void main(String[] args) 
	{
		String [] sr= {"Ruhi" , "Raaj" ,"Sai" ,"Soham"};
		
		System.out.println(sr[2]);
		System.out.println(sr.length);
		
		System.out.println("---print all data...");
		for(int i=0;i<=sr.length-1;i++)
		{
			System.out.println(sr[i]);
		}
		System.out.println("---print reverse order---");
		for(int i=sr.length-1;i>=0;i--)
		{
			System.out.println(sr[i]);
		}
		
		
		
	}

}
