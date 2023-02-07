package MultiLevel_Inheritance;

public class WhatApp3 extends WhatApp2
{
	public void vc()
	{
		System.out.println("vedio Calling");
		
	}

	public static void main(String[] args)
	{
		WhatApp3 w3=new WhatApp3();
	    w3.vc();
	    w3.ac();
	    w3.sms();		
		
	}
}
