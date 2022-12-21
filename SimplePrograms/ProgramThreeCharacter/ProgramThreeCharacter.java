
// an if loop program which recoginzes if a number is even or odd
// this one without loops
import java.util.Scanner;

class ProgramThreeCharacter {
	public static void main(String[] args) {
		char a, b, c, d, e;
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, user. Please enter three characters ");
		a = in.next().charAt(0);
		b = in.next().charAt(0);
		c = in.next().charAt(0);
		d = a > b ? a : b;
		e = d > c ? d : c;
		System.out.println(e + " is the largest character");
	}
}

// camel case is a convention which is used for naming methods and classes in
// java
// simiilarily in python two words are differentiated by the underscore .
// because that's the convention in python
// for example kunal's_method