package methods;

public class Additionpara
{
	public static void main(String[] args) 
	{
		test(12,13,14);
		test(12,1333,14);
		test(12,1111,14);
		test(12,1,14);
		
		System.out.println("-------------------");
		
		Additionpara A1=new Additionpara();
		A1.test1("druvi avinas devraj",'A',123);
		A1.test1("cinu avinas devraj",'A',124);

		A1.test1("rui avinas devraj",'A',153);

		A1.test1("varsa avinas devraj",'A',123);

		A1.test1("annu avinas devraj",'A',125);



		
	}
	public static void test(int a, int b,int c) 
	
	{
		System.out.println("addition of 3 nums==>"+(a*b+c));
	}
	
	public void test1(String name,char gread, int rollnum)
	{
		System.out.println(name+":==>"+gread+":==>"+rollnum);
		
	}
}