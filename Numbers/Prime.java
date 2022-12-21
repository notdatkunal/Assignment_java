import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int s = in.nextInt();
        int i=1;
	int count=0;
		while (i <= s) {
	if (s%i==0){
		//System.out.print(i + " ");	
		count++;
	}
            
            i++;
        }
	if (count==2){
	System.out.print("this is a prime number");
} else {
	System.out.print("this is not a prime number");
}
	
    }
}
