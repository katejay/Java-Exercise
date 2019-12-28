package array;

public class TwoDim1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3}, {4,5,6}};
		
		System.out.println(a[0][1]);
		
		for (int row=0; row<=1; row++)  // 2 rows
		{
			for (int col=0; col<=2; col++) // 3 columns
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println("");
		}
	}
}