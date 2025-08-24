package ArrayEAsy.ARRAYHARD.java;


public class Majority2 {
    public static void main(String[] args) {
        int [] arr={0,0,1,2,1,1,1,1,1,3,4,5};
        System.out.println(majorityElements(arr));
    }
    public static int majorityElements(int [] nums){
        int candidate =nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(count == 0){
              candidate =nums[i];
              count=1;
            }else if (nums[i] == candidate) {
                count++;
            }else{
                count --;
            }
        }
        return candidate;
    }
}

