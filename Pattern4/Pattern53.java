import java.util.Scanner;

public class Pattern53 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt() + 1;
		// int a = 'A';
		for (i = 1; i <= length; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			int a = 1;
			for (j = length - i; j != 0; j--) {

				System.out.print(a++);
			}
			System.out.println();
		}
	}
}
