package ARRAY;

public class MaximumOne {
    public static void main(String[] args) {
        int [] arr={1,1,1,0,0,1,0,1,1,0};
        int n=arr.length;
         int count=0;
         int maxcount=0;


         for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxcount=Math.max(maxcount,count);
            }else{
                count--;
            }

         }
         System.out.println("the answer is "+maxcount);

    }
    
}
