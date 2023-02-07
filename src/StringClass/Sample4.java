package StringClass;

public class Sample4
{
	public static void main(String[] args)
	{
		String s1="velocity";
		String s2="VELOCITY";
		String s3="my name is umesh";
		String s4="abcdabcdabcd";
		
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println("--------------------------");
		
		System.out.println(s1.equals(s2));  //compare data and case
		
		System.out.println(s1.equalsIgnoreCase(s2));   //compare only data
		
		System.out.println(s3.contains("is"));
	
		System.out.println("-----------------------------------");
		
		System.out.println(s3.startsWith("my"));
		
		System.out.println(s3.endsWith("umesh"));
		
		System.out.println(s1.charAt(4));
		
		
		System.out.println("-------------------------------------");
		
		System.out.println(s4.indexOf('b'));
		
		System.out.println(s4.lastIndexOf('c'));
		
		System.out.println(s3.replace("umesh", "Komal"));
		
	}

}
