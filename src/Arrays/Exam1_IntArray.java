package Arrays;

public class Exam1_IntArray 
{
	public static void main(String[] args)
	{
		
		//step1:array Declaration
		
		int[] ar=new int[5];
		
		//step2:aaray initialization
		
		ar[0]=102;
		ar[1]=103;
		ar[2]=104;
		ar[3]=106;
		ar[4]=105;
		
		
		//step3: array usage
		System.out.println(ar[4]);
		System.out.println(ar.length);
		
		System.out.println("----print all the data fromh int array-----");
		for(int i=0;i<=ar.length-1;i++)
		//for(int i=0;i<=4;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
