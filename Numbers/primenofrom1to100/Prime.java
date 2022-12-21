import java.util.Scanner;

class Prime {
	public static void main(String arg[]) {
		int i, count;
		System.out.print("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are ");
		int j = 2;
		while (j <= n) {
			count = 0;
			i = 1;
			while (i <= j) {
				if (j % i == 0) {
					count++;
				}
				i++;
			}
			if (count == 2)
				System.out.print(j + "  ");
			j++;
		}
	}
}