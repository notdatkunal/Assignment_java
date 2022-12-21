import java.util.Scanner;

public class MInToHours {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a minutes");
		float min = in.nextInt();

		float hr = min / 60;
		System.out.println(hr + " are the converted hours from " + min + " minutes");

	}
}