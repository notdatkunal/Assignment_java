class FirstMax{
	public static void main(String[] args){
		int[] a = {1,2,4,9,1};
		int num = 0;
		for(int i = 1;i<a.length;i++){

			num = a[i-1]<a[i]?a[i-1]:a[i];
		}
		System.out.println("the min number is "+num);
	}
}