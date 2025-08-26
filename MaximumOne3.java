public class MaximumOne3 {
    public static void main(String[] args) {
        int []arr={4,1,2,1,2};
        int n=arr.length;

        int xor=0;
        for(int num:arr){
            xor=xor^num;
        }
        System.out.println("the answer is"+xor);
    }
    
}
