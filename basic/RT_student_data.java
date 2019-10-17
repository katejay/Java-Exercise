package jay;
import java.util.Scanner;
public class RT_student_data {
	static String x;
	static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your name : ");
		x = sc.nextLine();
		
		System.out.print("Enter your roll number : ");
		y = sc.nextInt();
		
		System.out.println("Name is : " +x);
		System.out.println("Roll number is : " +y);
	}

}
