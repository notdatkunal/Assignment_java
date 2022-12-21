import java.util.Scanner;

public class Table2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter starting point");
        int i = in.nextInt();
        System.out.println("enter your ending point");
        int s = in.nextInt();
        if (i%2!=0){
		i++;	
	}
		while (i <= s) {
            System.out.print(i + " ");
            i=i+2;
        }
    }
}
