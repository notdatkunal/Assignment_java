import java.util.Scanner;

public class Pattern35 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		char a = 'a';
		for (i = 1; i <= length; i++) {
			for (j = 0; j <= length - i; j++) {
				System.out.print(a++ + " ");
			}

			System.out.println();
		}
	}
}
