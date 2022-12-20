
import java.util.Scanner;
class Happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int i,temp,sum=0,j=0;
        temp = num;
        while(sum!=1){
            sum=0;
            j++;
            while(temp!=0){
                i = temp%10;
                sum+=i*i;
                temp/=10;
            }
            
            temp = sum;
            if(j>20){
              System.out.println("not happy :(");
                return;
            }
            
        }
        
        System.out.println("happy :)");
    }
}