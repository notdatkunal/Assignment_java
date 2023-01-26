import java.util.Arrays;
import java.util.Scanner;

class Zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 1st array");
        int[] a = new int[sc.nextInt()];
        System.out.println("enter size of 2st array");
        int[] b = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter an element of array A");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("enter an element of array B");
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] c = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < c.length; i += 2) {
            if (count < a.length) {
                c[i] = a[count++];
            }
        }
        count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0 && count < b.length) {
                c[i] = b[count++];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}