import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		int A, B, C;
		String op;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first number ");
		A = in.nextInt();
		System.out.println("Enter your second number ");
		B = in.nextInt();
		System.out.println("Select the operation:  \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
		op = in.next();
		switch (op) {
			case "1":
				C = A + B;
				System.out.println("Addition is: " + C);
				break;
			case "4":
				C = A / B;
				System.out.println("Division is: " + C);
				break;

			case "2":
				C = A - B;
				System.out.println("Substraction is: " + C);
				break;

			case "3":
				C = A * B;
				System.out.println("Multiplication is: " + C);
				break;

		}
	}
}