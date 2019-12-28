package pyramid;

public class Number12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num=1;
		
		for (i=0; i<5; i++) // rows
		{
			for (j=0; j<=i; j++) // columns
			{
				System.out.print(num+" ");
				num++;	//change
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
11 12 13 14 15 

*/