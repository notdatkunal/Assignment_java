
// import java.util.Scanner;
import java.util.Arrays;

class Assignment {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter size of array");
        // int[] a = new int[sc.nextInt()];
        int[] a = { 1, 2, 1, 2, 3, 4, 6, 7, 5, 4 };
        int[] b = { 5, 23, 5432, 2, 35, 63 };
        // a = duplicate(a);
        // a = deleteIndex(a, 6);
        // int c = countDigits(a);
        // int c = checkDivisibility(a);
        // int c = countPalindrome(a);
        // int c = countPerfect(a);
        // int[] b = arrayDuplicate(a);
        // int[] c = arrayCombine(a, b);
        // int[] c = ArrayZigZag(a, b);
        // // c = uniqueArray(a);
        // System.out.println(Arrays.toString(c));
        // c = sort(c);
        // System.out.println(Arrays.toString(c));
        // c = sort2(c);
        // System.out.println(Arrays.toString(c));
        // countOccurrence(a);
        // sumAverageOfEven(a);
        // int c = minInt(a);
        // System.out.println(c);
        // nthSmallest(b, 3);
        a = reverse(a);

        System.out.println(Arrays.toString(a));
        // 7 and 8 answer
        sort(a);
        System.out.println(Arrays.toString(a));

        sort2(a);
        System.out.println(Arrays.toString(a));
        nthBiggest(a, 2);

    }

    // 9 Desing a method to Find 3rd Largest Number in an array
    // 10 Desing a method to Find 2nd Largest Number in an array
    // 11 Desing a method to Find Largest Number in an array
    static void nthBiggest(int[] a, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = maxInt(a);
            a = subtract(a, j, count(a, j));
        }
        System.out.println(n + " th minimun number in your array is " + j);
    }

    static int maxInt(int[] a) {
        int c = a[0];
        for (int i : a) {
            c = c > i ? c : i;
        }
        return c;
    }

    // 6 Design a method to reverse the elements of the array.
    static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int z = a.length - 1;
        for (int i : a) {
            b[z--] = i;
        }
        return b;
    }

    // 5 Design a method to find the first and second smallest element of the array.
    // 12 Desing a method to Find 2nd Smallest Number in an array
    // 13 Desing a method to Find Smallest Number in an array
    static void nthSmallest(int[] a, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = minInt(a);
            a = subtract(a, j, count(a, j));
        }
        System.out.println(n + " th minimun number in your array is " + j);
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

    // 4 Design a method to calculate the sum and average of the even element of the
    // array.
    static void sumAverageOfEven(int[] a) {
        int[] b = new int[0];
        for (int i : a) {
            if (i % 2 == 0) {
                b = add(b, i);
            }
        }
        System.out.println("sum of even numbers is " + sum(b));
        Average(b);

    }

    // 3 Design a method to display number of occurrence of each element in the
    // array.
    static void countOccurrence(int[] a) {
        for (int i : a) {
            occurrence(a, i);
        }
    }

    static void occurrence(int[] a, int i) {
        int c = 0;
        for (int j : a) {
            if (i == j) {
                c++;
            }
        }
        System.out.println("element " + i + " is repeated " + c + " times.");
    }

    // 7 Desing a method to sort the elements of an array in ascending order
    // 8 Desing a method to sort the elements of an array in descending order
    // 2 Design a method to merge two sorted array in the sorted form.

    // this method sorts the array in decreasing order
    static int[] sort2(int[] a) {
        int temp = 0;
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                count++;
            }
        }
        if (count == 0) {
            return a;
        }
        return sort2(a);
    }

    // this method sorts the array in increasing order
    static int[] sort(int[] a) {
        int temp = 0;
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                count++;
            }
        }
        if (count == 0) {
            return a;
        }
        return sort(a);
    }

    // 1 Design a method to merge two array element in zigzag manner.
    static int[] ArrayZigZag(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int z = 0;
        for (int i : a) {
            c[z] = i;
            z += 2;
            if (z == c.length) {
                z = 1;
            }
        }
        z = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0 && z < b.length) {
                c[i] = b[z];
                z++;
            }
        }

        return c;
    }

    // 15 Design a method to return nth smallest element.
    static int minInt(int[] a) {
        int c = a[0];
        for (int i : a) {
            c = c < i ? c : i;
        }
        return c;
    }

    // 14 Design a method to add unique elements and return from the array.
    static int[] uniqueArray(int[] a) {
        int b[] = new int[0];
        for (int i : a) {
            int c = 0;
            for (int j : a) {
                if (i == j) {
                    c++;
                }
            }
            if (c == 1) {

                b = add(b, i);
            }
        }
        return b;
    }

    static int[] add(int[] a, int z) {
        int[] b = new int[a.length + 1];
        int i = 0;
        for (int j : a) {

            b[i++] = j;

        }
        b[a.length] = z;
        return b;
    }

    // 13 Design a method to combine two arrays.
    static int[] arrayCombine(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int d = 0;
        for (int i : a) {
            c[d++] = i;
        }
        for (int i : b) {
            c[d++] = i;

        }
        return c;
    }

    // 12 Design a method to create the duplicate of existing array.
    static int[] arrayDuplicate(int[] a) {
        int[] b = new int[a.length];
        int c = 0;
        for (int i : a) {
            b[c++] = i;
        }
        return b;
    }

    // 11 Design a method to return how many perfect numbers are there in the array.
    static int countPerfect(int[] a) {
        int c = 0;
        for (int i : a) {
            if (Perfect(i)) {
                c++;
            }
        }
        return c;
    }

    static boolean Perfect(int a) {
        int i = 1;
        int sum = 0;
        while (i < a) {
            if (a % i == 0) {
                sum += i;
            }
            i++;

        }
        if (a == sum) {

            return true;
        }
        return false;
    }

    // 10 Design a method to return how many palindrome are there in the array.
    static int countPalindrome(int[] a) {
        int c = 0;
        int temp;
        for (int i : a) {
            temp = i;
            int j = 0;
            while (temp != 0) {
                j *= 10;
                j += temp % 10;
                temp /= 10;
            }
            if (i == j) {
                c++;
            }
        }
        return c;
    }

    // 9 Design a method to check how many numbers are divisible by 4,3and 5 in the
    // array.
    static int checkDivisibility(int[] a) {
        int c = 0;
        for (int i : a) {
            if (i % 4 == 0 && i % 3 == 0 && i % 5 == 0) {
                c++;
            }
        }
        return c;
    }

    // 8 Design a method to count how many digits in the array (digits not number).
    /*
     * following method will fail for test case of 002 number.
     * to overcome this situation the number might be converted into
     * string to count number of inputs
     * 
     */

    static int countDigits(int[] a) {
        int c = 0;
        for (int i : a) {
            while (i != 0) {
                c++;
                i /= 10;
            }

        }
        return c;
    }
    // 7 Design a method to delete the element at a particular index.

    static int[] deleteIndex(int[] a, int i) {
        int[] b = new int[a.length - 1];
        int c = 0;
        for (int ab = 0; ab < b.length; ab++) {
            if (c != i) {
                b[ab] = a[c];
            }
            c++;
        }
        return b;
    }
    // 6 Design a method to delete the duplicate elements from the array.
    // 14 Desing a method to Remove Duplicate Element in an array

    static int[] duplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    a[i] = 0;
                    continue;
                }
            }
        }
        int c = 0;
        for (int i : a) {
            if (i == 0) {
                c++;
            }
        }
        int[] b = new int[a.length - c];
        if (c == 0) {
            return a;
        }
        c = 0;
        for (int i = 0; i < a.length; i++) {
            if (c == b.length) {
                break;
            }
            if (a[i] != 0) {
                b[c++] = a[i];
            }
        }
        return duplicate(b);
    }

    // 1 Design a method to calculate the sum of n elements in an array.
    static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    // 2Design a method to calculate the average of n elements in an array.
    static void Average(int[] a) {
        System.out.println("Average is " + sum(a) / a.length);
    }

    static int minusCount(int[] a) {
        int count = 0;
        count = a.length - plusCount(a);
        return count;
    }
    // 5 Desing a method to count and display how many negative and positive numbers
    // present in your array.

    static int plusCount(int[] a) {
        int count = 0;
        for (int i : a) {
            count = i >= 0 ? count++ : count;
        }
        return count;
    }
    // 4 Desing a method to return how many odd numbers in the passed array.

    static int oddCount(int[] a) {
        int count = 0;
        for (int i : a) {
            count = i % 2 != 0 ? count++ : count;
        }
        return count;
    }
    // 3 Desing a method to return how many even numbers in the passed array.

    static int evenCount(int[] a) {
        int count = 0;
        for (int i : a) {
            count = i % 2 == 0 ? count++ : count;
        }
        return count;
    }
}