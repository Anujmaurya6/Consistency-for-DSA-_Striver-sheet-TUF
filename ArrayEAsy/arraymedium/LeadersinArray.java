package ArrayEAsy.arraymedium;

public class LeadersinArray {
    public static void main(String[] args) {
        int [] arr={16,12,13,17,5,4,3};
        int n=arr.length;

        int maxFromright=arr[n-1];//kyuki by defualt last element hamesha great hota he isliye

        System.out.println("leaders is"+maxFromright+" ");

        //right to left reverse
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxFromright){//current element us leader
                maxFromright=arr[i];
                System.out.println(maxFromright+" ");
            }
        }
    }
    
}
