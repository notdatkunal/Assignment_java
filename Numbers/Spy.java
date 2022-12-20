import java.util.Scanner;
public class Spy {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int number = sc.nextInt();
		int num = number;
		int sum,product;
		for ( sum=0,product=1;num!=0;num/=10){
			sum+=num%10;

			product*=num%10;
		}
		
		if (sum==product)
			System.out.println("spy");
		else
			System.out.println("not spy");
		// check if a number is pallindrome or not and check if it's spy or not 
		int pal;
		num = number;
		for (pal=0;num!=0;num/=10){
			pal= pal*10 + num%10;

		}
		if (pal==number)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
		// use equals ignore case method for string pallindrome program



	}
}
