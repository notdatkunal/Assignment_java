import java.util.Scanner;

public class Pattern33 {
	public static void main(String[] args) {
		int i, j, length;
		char a = 'a';
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		for (i = 1; i <= length; i++) {
			for (j = 0; j <= length - i; j++) {
				System.out.print(a + " ");
			}
			a++;
			System.out.println();
		}
	}
}
