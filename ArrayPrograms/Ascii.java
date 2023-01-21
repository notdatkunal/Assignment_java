import java.util.Scanner;
// take character as input and take sum of all ascii values of characters stored
class Ascii {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of an array");
        int i = sc.nextInt();
        int[] a = new int[i];
        for (int j = 0; j < a.length; j++) {
            System.out.println("enter a char");
            a[j] = sc.next().charAt(0);
        }
        for (int j = 0; j < i; j++) {
            sum += a[j];
        }
        System.out.println("SUM of ascii values = " + sum);
    }
}