package Arrays;

public class Exam2_StringArray 
{
	public static void main(String[] args)
	{
		String[] ar=new String[4];
		
		
		ar[0]="Ruhi";
		ar[1]="Cinu";
		ar[2]="komal";
		ar[3]="khushi";
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("----print all data-----");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
