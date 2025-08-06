package ArrayEAsy.arraymedium;

import java.util.HashMap;

public class majorityelements {
    /*💭 map.getOrDefault(num, 0)
Java kehta hai:
"Agar map me num (yani 2) already hai, toh uski purani value dedo."

"Agar num nahi mila, toh default me 0 dedo." */
    public static int findmajority(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;

        for(int num:arr){
            int count=map.getOrDefault(num, 0)+1;//"Agar num (yaha 2) map me hai, toh uski value do. Nahi toh 0 do"
            map.put(num, count);

            if(count>n/2){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        System.out.println("Majority Element: " + findMajority(arr));
    
    }
    
}
