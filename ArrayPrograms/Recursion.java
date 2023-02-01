import java.util.Arrays;
class Recursion{
	public static void main(String[] args){
		int[][] a = new int[3][3];
		int[][] b = {{2,1,3},{5,3,2},{7,8,9}};
		m1(a,b,0);
// 0 value should always be passed by default to intialise recursion call
		for(int[] i:a){
			System.out.println(Arrays.toString(i));
		}	
	}

// here recursion was used to assign values of 2d arrays instead of for loop
// or for each loop 
	static void m1(int[][]a,int[][]b,int c){
		if(c==a.length||c==b.length){
			return;
		}
		a[c]=b[c];
		c++;
		m1(a,b,c);
	}
}
