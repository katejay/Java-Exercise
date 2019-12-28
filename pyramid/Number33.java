package pyramid;

public class Number33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,num;
		for(i=0; i<5; i++) // rows
		{
			num=1;
			for(k=2*(5-i); k>=0; k--) // spaces
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
         1 2 
       1 2 3 
     1 2 3 4 
   1 2 3 4 5 

*/