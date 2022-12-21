import java.util.Scanner;

public class HoursToSeconds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a seconds");
		int hr = in.nextInt();

		int sec = hr * 3600;
		System.out.println(sec + " are the converted seconds from " + hr + " hours");

	}
}