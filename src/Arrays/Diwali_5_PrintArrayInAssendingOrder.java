package Arrays;
import java.util.Arrays;
public class Diwali_5_PrintArrayInAssendingOrder 
{
	public static void main(String[] args)
	{
        int [] ar=new int[5];
		
		ar[0]=11;
		ar[1]=22;
		ar[2]=33;
		ar[3]=44;
		ar[4]=55;
		
		System.out.println(ar.length);
		System.out.println(ar[4]);
		
		System.out.println("---print all data-----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		
		System.out.println("---print all Assending order----");
		//for(int i=ar.length-1;i>=0;i++)
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
