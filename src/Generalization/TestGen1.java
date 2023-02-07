package Generalization;

public class TestGen1 
{
	
	public static void main(String[] args) 
	{
		System.out.println("---features of vi simcard------");
    	VI v =new VI();
		v.sms();
		v.audio_calling();
		v.data();
		
		System.out.println("---features of airtel simcard------");
    	Airtel a =new Airtel();
		a.sms();
		a.audio_calling();
		a.data();
		
		System.out.println("---features of jio simcard------");
    	Jio j =new Jio();
		j.sms();
		j.audio_calling();
		j.data();
		
	}

}
