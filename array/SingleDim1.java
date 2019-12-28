package array;

public class SingleDim1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		String b[]= {"Mon","Tue","Wed","Thur"};
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
		 
		System.out.println();
		 
		for (int j=0; j<4; j++)
		{
			System.out.print(" "+b[j]);
		}
	}
}