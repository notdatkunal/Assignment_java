import java.util.Scanner;

class Interest {
	public static void main(String[] args) {
		int P, T, R, A;
		/*
		 * P - principle
		 * T - time (in years)
		 * R - rate (annual interest rate)
		 * A - Simple interest
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principle ");
		P = input.nextInt();
		System.out.println("Enter time ");
		T = input.nextInt();
		System.out.println("Enter rate ");
		R = input.nextInt();
		A = P * (1 + (R * T));
		System.out.println("The simple interest is " + A);

	}
}