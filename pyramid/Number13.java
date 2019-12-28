package pyramid;

public class Number13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num;
		
		for (i=0; i<5; i++) // rows
		{
			num=1;	// change
			for (j=0; j<=i; j++) // columns
			{
				System.out.print(num+" ");
				num++;	// change
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