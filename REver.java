public class REver {

    public static void main(String[] args) {
       String str="java is awesome ";
       char[] s=str.toCharArray();
       int n=s.length;

       int left=0;
       int right=n-1;
       
       while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
       }

       int start =0;
       for(int end=0;end<=n;end++){
        if(end == n || s[end] == 0){
               left = start;       // start of current word
                right = end - 1;    // end of current word
                while (left < right) {
                    // swap characters to reverse the word
                    char temp = s[left];
                    s[left] = s[right];
                    s[right] = temp;
                    left++;
                    right--;
                }
                start=end+1;
        }
       }

       String result=new String(s);
       System.out.println(result);
    }
}
