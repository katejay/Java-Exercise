package array;

public class SingleDim {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		//for (int i=0; i<4; i++)
		for (int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);	
		}
	}
}