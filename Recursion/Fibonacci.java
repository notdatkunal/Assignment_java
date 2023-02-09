//fibonacci number by recursion
class Fibonacci{
	public static void main(String[] args){
		
		System.out.println(Fibo(67));
	}
 static int Fibo(int n){
        if(n==0||n==1){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}