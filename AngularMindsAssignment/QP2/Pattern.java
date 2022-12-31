import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
	//	System.out.println("hi");
		pattern2();
		System.out.println();
		
	}
	static void pattern1(){
		int i,j,a=15;
		for(i=0;i<5;i++){
				for(j=1;j<=5-i;j++){
					System.out.print(a+" ");
					a--;
						}
			System.out.println();
				}
			}
	static void pattern2(){
		int i,j;
		for(i=5;i!=0;i--){
				for(j=i;j<6-i;j--){
					System.out.print(j+" ");
					
						}
			System.out.println();
				}
			}

}