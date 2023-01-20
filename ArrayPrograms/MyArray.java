import java.util.Arrays;
import java.util.Scanner;

// create an array which takes input of characters and prints only vowels out of them
class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = new char[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next().charAt(0);
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                System.out.print(a[i]);
                if (i < a.length - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("]");
    }
}