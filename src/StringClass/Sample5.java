package StringClass;

public class Sample5 
{
	public static void main(String[] args) 
	{
		String m1="maharastra";
		 String m2="MAHARASTRA";
		 String m3="i am good testing engineear";
		String m4="xyzxyzxyz";
		
		System.out.println(m1.length());
		
		System.out.println(m1.toUpperCase());
		
		System.out.println(m2.toLowerCase());
		
		System.out.println(m1.equals(m2));
		
		System.out.println(m1.equalsIgnoreCase(m2));
		
		System.out.println("--------------------");
		
		System.out.println(m3.startsWith("i"));
		
		System.out.println(m3.endsWith("engineear"));
		
		System.out.println(m3.contains("testing"));
		
		System.out.println(m3.startsWith("i"));
		
		System.out.println(m3.endsWith("engineear"));
		
		System.out.println(m4.indexOf('z'));
		
		System.out.println(m4.lastIndexOf('x'));
		
		System.out.println(m1.charAt(2));
		
		System.out.println(m3.replace("good", "Excelent"));
		
		
		
		
	}

}
