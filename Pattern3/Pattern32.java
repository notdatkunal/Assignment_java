import java.util.Scanner;

public class Pattern32 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		for (i = 1; i <= length; i++) {
			for (j = 0; j <= length - i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
