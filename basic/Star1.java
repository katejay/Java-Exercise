package jay;

public class Star1 {
	static int i,k;
	static int j=4;
	static int l=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        for (i = 1; i <= j; i++, l = 0) {
            for (k = 1; k <= j - i; k++) {
                System.out.print("  ");
            }

            while(l != 2 * i - 1) {
                System.out.print("1 ");
                l++;
            }

            System.out.println();
        }
	
	}
}
