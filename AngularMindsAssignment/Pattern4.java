import java.util.Scanner;
public class Pattern4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i,j,k,length;
		
		System.out.println("enter your length");
		length = in.nextInt();
		for (i=0;i<=length;i++){
			k=1;
			for(j=1;j<=length;j++){
				if(i==0||j==1||j==length||i==length)
				{	System.out.print("* ");
					}
				else{
					System.out.print(k++ +" ");
				}
			}
			System.out.println();
		}
	}
}
