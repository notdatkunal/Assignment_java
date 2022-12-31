// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String s = " Hello, Kunal ";
        int l = s.length()-1;
        int j=0;
        int len = 0;
        int i=0;
        while (i<=l){
            if(s.charAt(i)==' ')
            {
                j = len;
                len = 0;
            }
            else{
                len++;
            }
            i++;
        }
        System.out.println(len==0?j:len);

    }
}