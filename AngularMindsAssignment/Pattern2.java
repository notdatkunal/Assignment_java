import java.util.Scanner;
public class Pattern2{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int i,j,k;
		k = 1;
		System.out.println("enter your length");
		int l = in.nextInt();
		for(i=0;i<=l;i++){
			
			for (j=1;j<=i;j++){
				System.out.print(k++%2);
			}
			System.out.println();
		}
	}
}
