class Test{
	static int sum = 0;
	public static void main(String[] args)
	{
		m1(7);
	}
	static void m1(int i){
	System.out.print(i);
	sum+=i;
		if(i<2){
			System.out.print(" = "+sum);
		return ;
		}
	System.out.print(" + ");
		m1(i-1);
	}
}
