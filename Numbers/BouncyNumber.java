// BouncyNumber program
// a bouncy number is a number which 
// is both decreasing and increasing simultaneously 
import java.util.Scanner;
public class BouncyNumber{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to check for bouncy number");
		int a,b,c,d,num;
		boolean increasing,decreasing;
		increasing = true;
		decreasing = true;
		c= 0;
		d = 0;
		num = in.nextInt();
		a = num;
		while (a!=0){
			b = a%10;
			
			if(b-d>0){
			
			//	c++;
			increasing = false;

			}
			d = b;
			a/=100;
		}
		a= num;
		b = 0;
		d= 0;
		while (a!=0) {

			b = a%10;
		if (b-d<0){
			
			//	d++;
			decreasing = false;
			}
		d = b;
		a/=100;
		}


		
		if (!increasing&&!decreasing){
			System.out.println("not bouncy");
			return;
		}
		
			System.out.println("bouncy");
	}
}
