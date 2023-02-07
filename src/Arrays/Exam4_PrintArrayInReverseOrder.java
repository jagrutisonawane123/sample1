package Arrays;

public class Exam4_PrintArrayInReverseOrder 
{
	public static void main(String[] args) 
	{
		int[] ar=new int[5];
		
		
		ar[0]=101;
        ar[1]=105;
        ar[2]=103;
        ar[3]=102;
        ar[4]=104;
        
        //System.out.println(ar[0]);
       // System.out.println(ar.length);
        
        
    System.out.println("---print all data----");
    for(int i=0;i<=ar.length-1;i++)
    {
    	System.out.println(ar[i]);
    }
    
    System.out.println("----print Array in reverse order'-----");
    
    for(int i=ar.length-1;i>=0;i--)
    {
    	System.out.println(ar[i]);
		
	}

}
}
