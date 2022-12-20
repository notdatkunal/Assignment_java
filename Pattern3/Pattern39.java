import java.util.Scanner;

public class Pattern39 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		int a = 1;
		char b = 'a';
		for (i = 1; i <= length; i++) {
			for (j = 0; j <= length - i; j++) {
				if (j % 2 == 0) {
					System.out.print(a++ + " ");
				} else {
					System.out.print(b++ + " ");
				}

			}

			System.out.println();
		}
	}
}
