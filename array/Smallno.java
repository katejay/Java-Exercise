package array;

public class Smallno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] myList = {9, 29, 34, 5};
		 int min = myList[0];
	     for (int i = 1; i < myList.length; i++)
	      {
	         if (myList[i] < min) {
	        	 min = myList[i];
	         }
	      }
	      System.out.println("Min is " +min);  		
	}
}