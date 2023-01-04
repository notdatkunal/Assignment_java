import java.util.Scanner;

class Harshad {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
        int num = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (num % sum == 0) {
            System.out.println("harshad");
            return;
        }
        System.out.println("not harshad");
	}
}