package ArrayEAsy;

public class MovezeroestoEnd {
    public static void main(String[] args) {
                int[] arr = {0, 1, 0, 3, 12}; 
                int index=0;

                for(int i=0;i<arr.length;i++){
                    if(arr[i]!=0){
                        arr[index++]=arr[i];
                    }
                }
                while(index<arr.length){
                    arr[index++]=0;
                }
                 System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
    }
}   
}
