public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "    Hello,    Kunal      ";
        int l = s.length()-1;
        int j=0;
        int len = 0;
        int i=0;
        while (i<=l){
            if(s.charAt(i)!=' ')
            {
                len++;
                j = len;
            }
            else{
                len = 0;

            }
            i++;
        }
        System.out.println(len==0?j:len);

    }
}