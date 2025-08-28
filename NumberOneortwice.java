package ARRAY;

public class NumberOneortwice {
    public static void main(String[] args) {
        int [] arr={4,1,2,3,1,1,2};
        int n=arr.length;
        
         for(int i=0;i<n;i++){
         int count=0;
          for(int j=1;j<n;j++){
        if(arr[i]==arr[j]){
            count++;
        }
    }if(count ==1){
            System.out.println("the answer is"+arr[i]);
            break;
        
        }
        }
    }
}

//find the number that appear once and other number twice ka code