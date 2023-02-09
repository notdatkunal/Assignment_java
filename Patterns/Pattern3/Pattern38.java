import java.util.Scanner;

public class Pattern38 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		char b = 'a';
		for (i = 1; i <= length; i++) {
			int a = 1;
			for (j = 0; j <= length - i; j++) {

				System.out.print(a + " ");
				a += 2;

			}

			System.out.println();
		}
	}
}
