import java.util.Scanner;

public class Strong {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, factorial, digit, sum, temp;
        i = 1;
        factorial = 1;
        num = sc.nextInt();
        temp = num;
        sum = 0;
        while (temp > 0) {
            digit = temp % 10;
            while (i <= digit) {
                factorial *= i;
                i++;
            }
            sum += factorial;
            temp /= 10;
        }
        if (num != sum) {

            System.out.println("not strong");
            return;
        }
        System.out.println("Strong");

    }
}
