package ArrayEAsy;

public abstract class LargestElement {
    public static void main(String[] args) {
        
    
    int [] arr={23,21,11,10,54,32,25,67};
    int n=arr.length;

    int max=arr[0];

    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("the ansswer is "+max);
}
}
