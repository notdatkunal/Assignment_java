import java.util.Scanner;

public class HourToMin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a hours");
		float hours = in.nextInt();

		float min = hours * 60;
		System.out.println(min + " are the converted minutes from " + hours + " hours");

	}
}