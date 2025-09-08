import java.util.HashSet;

public class CODing {

    //move zeroes to end
    public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 4};
    int arr2[] = {3, 4, 5, 6};

    int i=0;
    int j=0;
    int n=arr1.length;
    int m=arr2.length;
  
    HashSet<Integer> set=new HashSet<>();
    while(i<n && j<m){
      if(arr1[i]<arr2[j]){
         i++;
      }else if(arr1[i]>arr2[j]){
        j++;
      }else{
        set.add(arr1[i]);
        i++;
        j++;
      }
    }
      System.out.println("the ansewr is"+set);
    
    

    }
  }
