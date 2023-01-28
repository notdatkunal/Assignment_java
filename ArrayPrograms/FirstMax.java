import java.util.Scanner;
class FirstMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int[] a = new int[sc.nextInt()];
		
		System.out.println("enter inputs for your array");
		for(int i = 0;i<a.length;i++){
			a[i]= sc.nextInt();
			}
		int num = max(a);
		
		System.out.println("the first max number is "+a[num]);
		a[num]=0;
		num = max(a);
		System.out.println("the second max number is "+a[num]);
		a[num]=0;
		num = max(a);
		System.out.println("the third max number is "+a[num]);
	}

	static int max(int[]a){
		int num = 0;
		for(int i = 0;i<a.length;i++){

			num = a[num]>a[i]?num:i;
		}
		return num;
	}
}
