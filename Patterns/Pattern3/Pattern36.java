import java.util.Scanner;

public class Pattern36 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		int a = 1;
		for (i = 1; i <= length; i++) {
			for (j = 0; j <= length - i; j++) {
				if (i % 2 != 0)
					System.out.print(a + " ");

				a++;
			}

			System.out.println();
		}
	}
}
