import java.util.Scanner;

class CharToAscii {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner input = new Scanner(System.in);
		System.out.println("enter an int type data ");
		a = input.nextInt();
		b = a % 2 == 0 ? 0 : 1;
		System.out.println((b == 0 ? true : a) + " is your expected output");
	}
}