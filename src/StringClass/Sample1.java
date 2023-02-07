
package StringClass;

public class Sample1
{
	public static void main(String[] args)
	{
		String s1;//only declaration of string
		
		//System.out.println(s1);
		String s2="abc"; 
		System.out.println(s2);
		//declaration and initialization
		
		String s3="ab";
		System.out.println(s3);
		
		s3=s3+"cd";  //ab+cd =abcd
		System.out.println(s3);
		
		s3=s3+"xyz";  //abcd+xyz=abcdxyz
		
		System.out.println(s3);
		
		
		s3=s3+"ABCDXYZ";
		System.out.println(s3);
		
		
		s3=s3+"pqrstuv";
		System.out.println(s3);
		
		
		
	}













}
