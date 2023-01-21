import java.util.Scanner;
// sum of even numbers only in array of int
class Even2 {

    public static void main(String[] args) {
        int even = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of an array");
        int i = sc.nextInt();
        int[] a = new int[i];
        for (int j = 0; j < a.length; j++) {
            System.out.println("enter a number");
            a[j] = sc.nextInt();
        }
        for (int j = 0; j < i; j++) {
            if (a[j] % 2 == 0) {
                even += a[j];
            }
        }
        System.out.println("even addition = " + even);
    }
}