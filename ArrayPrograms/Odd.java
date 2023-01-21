import java.util.Scanner;
// sum of odd numbers stored in array of int type
class Odd {

    public static void main(String[] args) {
        int even = 0, odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of an array");
        int i = sc.nextInt();
        int[] a = new int[i];
        for (int j = 0; j < a.length; j++) {
            System.out.println("enter a number");
            a[j] = sc.nextInt();
        }
        for (int j = 0; j < i; j++) {
            if (a[j] % 2 != 0) {
                odd += a[j];
            }
        }
        System.out.println("odd addition = " + odd);
    }
}