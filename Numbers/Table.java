import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter starting point");
        int i = in.nextInt();
        System.out.println("enter your ending point");
        int s = in.nextInt();
        
		while (i <= s) {
	if (i%2==0){
		System.out.print(i + " ");	
	}
            
            i++;
        }
    }
}
