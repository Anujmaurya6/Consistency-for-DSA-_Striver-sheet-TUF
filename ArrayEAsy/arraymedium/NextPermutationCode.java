package ArrayEAsy.arraymedium;

import java.util.Arrays;

public class NextPermutationCode {
    public static void main(String[] args) {
        int [] nums={100,4,200,1,3,2};

        //sort karunga array ko 
        Arrays.sort(nums);

        int maxLength=1;
        int currentLength=1;

        //check consecutive number

        for (int i = 1; i < nums.length; i++) {  // Loop 2nd element se start karo
    if (nums[i] == nums[i-1] + 1) {      // Kya current number pichle number ka next hai?
        currentLength++;                  // Ha! Toh streak badhao
        maxLength = Math.max(maxLength, currentLength); // Record update karo
    } 
    else if (nums[i] != nums[i-1]) {     // Agar same number nahi hai (duplicates handle karne)
        currentLength = 1;               // Streak reset karo (naya sequence shuru hoga)
    }
}
System.out.println("Longest sequence is"+maxLength);
    }
}
/// Loop with embedded example explanation
   
            // i=1: nums[1]=2 vs nums[0]=1 → 2==1+1? ✅ → current=2, max=2
            // i=2: nums[2]=3 vs nums[1]=2 → 3==2+1? ✅ → current=3, max=3
            // i=3: nums[3]=4 vs nums[2]=3 → 4==3+1? ✅ → current=4, max=4
            // i=4: nums[4]=100 vs nums[3]=4 → ❌ → reset current=1
            // i=5: nums[5]=200 vs nums[4]=100 → ❌ → reset current=1
            
