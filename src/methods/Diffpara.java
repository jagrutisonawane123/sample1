package methods;

public class Diffpara 
{
	
	public static void main(String[] args) 
	{
		diff("rajveer",102,"blueberry","mca",1222222);		
		diff("veerveer",103,"blackberry"," macanical engineer ",3434343);		
		diff("meetveer",104,"appleberry","bca",888888);
		
		System.out.println("--------------------");
		
    Diffpara d1=new Diffpara();
   		
d1.mul(22,2);
d1.mul(33,2);
d1.mul(32,2);

d1.mul(12,2);


		

		
		
	}
	public static void diff(String name,int empid,String productname,
			String empeducation,long salary) 
	{
		System.out.println(name+"=> "+empid+"=> "+productname+"=> "
	+empeducation+"=>"+salary);
	}
	
	public void mul(int a,int b)
	{
		System.out.println(a*b);
		
	}

}
