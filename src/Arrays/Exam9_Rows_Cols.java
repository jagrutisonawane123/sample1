package Arrays;

public class Exam9_Rows_Cols 
{
	public static void main(String[] args)
	{
		int[][] ar= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println(ar[0][2]);
		
		System.out.println("-------------------");
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
