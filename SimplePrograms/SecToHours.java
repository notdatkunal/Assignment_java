import java.util.Scanner;

public class SecToHours {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a seconds");
		float sec = in.nextInt();

		float hr = sec / 3600;
		System.out.println(hr + " are the converted hours from " + sec + " seconds");

	}
}