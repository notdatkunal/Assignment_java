import java.util.Arrays;
import java.util.Scanner;
class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[] a = new int[sc.nextInt()];
		System.out.println("provide inputs");
		for(int i = 0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		sort(a);
		System.out.println(Arrays.toString(a));
		sort2(a);
		System.out.println(Arrays.toString(a));

	}
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
}
