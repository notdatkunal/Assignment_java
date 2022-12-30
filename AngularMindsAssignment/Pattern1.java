import java.util.Scanner;
public class Pattern1{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,k,l;
		System.out.println("enter your length");
		l = sc.nextInt();
		k=1;
		for(i=1;i<=l;i++){
			k = i;
			for (j=1;j<=l;j++){
				System.out.print(k++);
				if(k==6)
					k = 1;
				}
			System.out.println();
		}
	}
}
