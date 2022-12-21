import java.util.Scanner;

class Sum {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int num, sum;
    num = sc.nextInt();
    sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println(sum + " is the sum of the entered digit ");

  }
}
