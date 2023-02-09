import java.util.Scanner;

class MagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        sum = sumOf(num);
        System.out.println(isMagic(num, sum));
    }
// following function returns the addition of all digits 
    public static int sumOf(int i) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
// following function checks if the number is magic or not 
    public static int isMagic(int a, int b) {
        int num = b;




        while (num > 9) {
            num = sumOf(num);
        } 

num = num!=1?0:1;

// can also be done using recursion

     return num;

    }
}