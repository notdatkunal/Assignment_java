import java.util.Arrays;
import java.util.Scanner;

class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int[] a = new int[sc.nextInt()];
        System.out.println("enter elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("your array is :");
        System.out.println(Arrays.toString(a));
        int[] b = new int[0];// for copied elements
        int c = 0;
        for (int i = 0; i < a.length; i++) {

            c = count(a, a[i]); // this method counts number of times an element is repeated
            if (c > 1) {

                b = add(b, a[i]);// adds repeated element to the array B
                System.out.println(a[i] + " is repeated " + c + " times");// this line tells how many times an
                                                                          // element is repeated
                a = subtract(a, a[i], c);// subtracts that repeated element from array A
            }

            c = 0;

        }
        sc.close();
        System.out.print("unique elements are ");
        System.out.println(Arrays.toString(a));
        System.out.print("copied elements are ");
        System.out.println(Arrays.toString(b));
    }

    static int[] add(int[] a, int j) {
        int[] b = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];

        }
        b[b.length - 1] = j;
        a = b;
        return a;
    }

    static int count(int a[], int x) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                c++;
            }
        }
        return c;
    }

    static int[] subtract(int[] a, int x, int n) {
        /*
         * a is the array
         * x is the number
         * n is number of times it's repeated
         */
        int c = 0;
        int[] b = new int[a.length - n];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {

                b[c++] = a[i];
            }
        }
        return b;
    }
}
