import java.util.Scanner;

public class Pattern42 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		for (i = 0; i <= length; i++) {
			for (int k = 0; k <= length - i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
	}
}
