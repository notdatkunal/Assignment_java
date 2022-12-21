import java.util.Scanner;

public class Perfect 
{
  public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.println("enter a number");
      int s = in.nextInt();
      int perfect = 0;
      int temp = s;
      int i = 1;
      while (i <= s) 
      {
        if (s % i == 0) 
        {
	 perfect = perfect + i;
        }
       i++;
     }
       perfect -= temp;
       if (temp == perfect) 
       {
         System.out.print(temp+" is a perfect number");
         return;
       } 
        System.out.println("not perfect");
		

   }
}