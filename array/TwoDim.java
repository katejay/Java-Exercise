package array;

public class TwoDim {

	public static void main(String[] args) {
		
		int a[][]= new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		for (int row=0; row<=1; row++)
		{
			for (int col=0; col<=1; col++)		
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println("");
		}
	}
}