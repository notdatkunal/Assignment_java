import java.util.Scanner;

class Factorial {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, factorial;
        i = 1;
        factorial = 1;
        num = sc.nextInt();
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial + " is the sum of the entered digit ");

    }
}
