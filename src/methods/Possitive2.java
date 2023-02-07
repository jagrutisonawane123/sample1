package methods;

public class Possitive2
{ 
	//4 non static method call from differnt calss
	public static void main(String[] args) 
	{
		 Possitive3 raj=new Possitive3();//1:object create from diff class
		 raj.A2();
		 raj.A3();//method create from diff class
		 raj.A3();//diffclassobjectname.methodname();
		 raj.A3();
		 raj.A2();
		 
		 
	}

}
