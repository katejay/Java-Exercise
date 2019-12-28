package pyramid;

public class Stars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=0; i<5; i++)	// rows
		{
			for(k=5-i; k>1; k--) // spaces - imp line
			{
				System.out.print(" ");
			}
			
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