import java.util.Scanner;

public class Kunal {
	enum Day {
		monday,
		tuesday,
		wednesday,
		thursday,
		friday,
		saturday,
		sunday
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a day");
		String day = in.nextLine();
		Day myday = Day.valueOf(day);
		switch (myday) {

			case monday:
			case thursday:
				System.out.println("cricket");
			case tuesday:
				System.out.println("volleyball");
			case wednesday:
			case friday: // case "Saturday" (can also be done this way)
				System.out.println("football");
			case saturday:
				System.out.println("basketball");
			case sunday:
				System.out.println("sleep");

		}

	}
}