package pyramid;

public class Number32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,num=1;
		for(i=0; i<4; i++) // rows
		{
			for(k=2*(4-i); k>=0; k--) // spaces
			{
				System.out.print(" ");
			}
			
			for (j=0; j<=i; j++) // columns
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}
	}
}

/*

output 
         1 
       2 3 
     4 5 6 
   7 8 9 10 

*/