import java.util.Scanner;

class Length {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int num, count;
    num = sc.nextInt();
    count = 0;
    while (num != 0) {
      num /= 10;
      count++;
    }
    System.out.println(count + " is the length of the digit");

  }
}
