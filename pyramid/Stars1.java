package pyramid;

public class Stars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for (i=0; i<5; i++) // rows
		{
			for (j=0; j<=i; j++) // columns
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*

output 
* 
* * 
* * * 
* * * * 
* * * * *

*/