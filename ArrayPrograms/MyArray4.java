import java.util.Arrays;
import java.util.Scanner;

// create an array which takes input of integers and prinnt the square of it if it's even else print cube of it
class MyArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {

                System.out.print(a[i] * a[i]);
            } else {
                System.out.print(a[i] * a[i] * a[i]);
            }
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}