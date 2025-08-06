package ArrayEAsy;

public class LeftRotate {
    public static void main(String[] args) {
        
    
    int[]arr={10,20,30,40,50,60};
    int n=arr.length;

    int first=arr[0];

    for(int i=0;i<n-1;i++){
        arr[i]=arr[i+1];
    }
    arr[n-1]=first;
    System.out.print("Array after 1 left rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
    }
}
}
