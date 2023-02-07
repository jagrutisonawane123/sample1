package User_Define_con_para;

public class Diwali_1_Sameclass 
{
	
	int a1;
	int a2;
	
	 Diwali_1_Sameclass(int a,int b)
	 {
		 a1=a;
		 a2=b;
	 }
	 public void add()
	 {
		 System.out.println(a1+a2);
		
	}
	 public void mul()
	 {
		 System.out.println(a1*a2);
		
	}
	public static void main(String[] args)
	{
		Diwali_1_Sameclass d1=new Diwali_1_Sameclass(12,22);
		d1.add();
		d1.mul();
		
		Diwali_2_Diffclass d2=new Diwali_2_Diffclass(44,11);
		d2.div();
		
	}
	

}
