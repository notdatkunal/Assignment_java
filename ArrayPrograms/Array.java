import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("enter length of your array");
        Scanner sc = new Scanner(System.in);
        int a[] = new int[sc.nextInt()];
        System.out.println("enter inputs");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("enter index");
        int num = sc.nextInt();
        int[] b = arrayshift(a, num);
        System.out.println(
                "your input was :" + Arrays.toString(a) + "\t index: " + num + "\t new array :" + Arrays.toString(b));
    }

    static int[] arrayshift(int[] a, int num) {

        int b[] = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[num++];
            if (num == a.length) {
                num = 0;
            }
        }
        return b;
    }
}
