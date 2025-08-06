package ArrayEAsy;

public class LeftRotateDplace {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int d=2;
        int n=arr.length;

        for(int i=0;i<d;i++){
            int first=arr[0];

            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
         System.out.print("Array after " + d + " left rotations: ");
        for (int num : arr) {
            System.out.print(num + " ");
    }
}
}
