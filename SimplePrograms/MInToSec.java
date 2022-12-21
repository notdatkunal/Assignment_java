import java.util.Scanner;

public class MInToSec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a minutes");
		float min = in.nextInt();

		float sec = min * 60;
		System.out.println(sec + " are the converted seconds from " + min + " minutes");

	}
}