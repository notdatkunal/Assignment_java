public class Lucky {
    public static void main(String[] args) {
       int start=1;
       int end=100;
       int count = start;  //count
       while(start<=end)
       {
           if(start%2!=0){
                if(count%3!=0)
				{
                          System.out.print(start+" "); // this prints lucky number series
                        }
                count++;    
            }
           start++;
           
       }//while loop ends
    } // main method ends
}