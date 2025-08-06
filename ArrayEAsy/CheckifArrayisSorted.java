package ArrayEAsy;

public class CheckifArrayisSorted {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        boolean isSorted=true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
          if (isSorted) {
            System.out.println("Array sorted hai (ascending).");
        } else {
            System.out.println("Array sorted nahi hai.");
        }
    }
}
