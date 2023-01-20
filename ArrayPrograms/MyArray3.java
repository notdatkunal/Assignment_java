import java.util.Arrays;
import java.util.Scanner;

// create an array which takes input of floats and prints those inpurt in integers
class MyArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] a = new float[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextFloat();
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print((int) a[i]);
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}