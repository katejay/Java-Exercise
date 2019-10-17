package jay;

public class Star {
	static int i,j,k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (i=1; i<=5; i++)
		{
			for (j=i; j>5; j++)
			{
			System.out.print(" ");
			}
			
			for (k=1; k<=2*i-i; k++)
			{
				System.out.print(" "+i);
			}
			System.out.println();

		}
	}
}
