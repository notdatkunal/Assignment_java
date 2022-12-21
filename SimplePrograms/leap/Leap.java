import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a year ");
		int year = in.nextInt();
		if (year % 4 == 0) {
			System.out.println("This is a leap year");
			return;
		}
		System.out.println("this is not a leap year");

	}
}