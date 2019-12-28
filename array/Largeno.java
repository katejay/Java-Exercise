package array;

public class Largeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] myList = {9, 29, 34, 5};
		 int max = myList[0];
	     for (int i = 1; i < myList.length; i++)
	      {
	         if (myList[i] > max) {
	        	 max = myList[i];
	         }
	      }
	      System.out.println("Max is " + max);  
	}
}