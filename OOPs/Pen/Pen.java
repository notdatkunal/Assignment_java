import java.util.Scanner;
// create 5 objects of a class pen and take inputs in them and display them as a table
class Pen {
	int price;
	String name;

	Pen() {
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter name of object");
		String name = sc.next();
		System.out.println("please enter price");
		int price = sc.nextInt();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		Pen a = new Pen();
		Pen b = new Pen();
		Pen c = new Pen();
		Pen d = new Pen();
		Pen e = new Pen();
		System.out.println("name   price");
		System.out.println(a.name + " " + a.price);
		System.out.println(b.name + " " + b.price);
		System.out.println(c.name + " " + c.price);
		System.out.println(d.name + " " + d.price);
		System.out.println(e.name + " " + e.price);
	}
}
