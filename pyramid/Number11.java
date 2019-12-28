package pyramid;

public class Number11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num=1;
		
		for (i=0; i<5; i++) // rows
		{
			for (j=0; j<=i; j++) // columns
			{
				System.out.print(num+" ");
			}
			System.out.println();
			num++;
		}
	}

}

/*

output 
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5

*/