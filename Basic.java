package ARRAY;


public class Basic {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int d=2;
        d=d%n;

      int start =0;
      int end=d-1;

        while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
        }

        start=d;end=n-1;
        while(start<end){
       int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
        }

          start=0;end=n-1;
        while(start<end){
       int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
        }

for(int num:arr){
  System.out.println("the answer is"+num);
}

      }
    }
    