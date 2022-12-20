import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		int i,j,length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		for(i=0;i<=length;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
// this is a basic pattern boilerplate program
	}
}
