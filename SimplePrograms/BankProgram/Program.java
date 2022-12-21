import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    int password, amount, total;
    Scanner input = new Scanner(System.in);
    System.out.println("please enter your password");
    password = input.nextInt();

    System.out.println(password == 123 ? "please enter you amount" : "incorrect password");
    amount = password == 123 ? input.nextInt() : 0;
    total = 1000;

    if (amount < total && password == 123) {
      total = total - amount;
      System.out.println("you have withdrawed " + amount);
      System.out.println("your remaining balance is " + total);
      return;
    }
    System.out.println(password == 123 ? "exceeded total limit" : " ");
  }
}