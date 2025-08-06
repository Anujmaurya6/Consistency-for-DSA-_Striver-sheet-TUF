package ArrayEAsy.arraymedium;

import java.util.*;

public class Positvenegative {
    /*idhar question ka matlab yehi he ki idhar mujhe
    array ko kuch is tarah se arragenge karna he ki answer + - + - + - \
    number bas isi form me hona chaiye bas
    */

    public static rearrange(int [] arr){

        //do alag list banate he=ek pos ke liye or ek neg ke liye
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num); // Positive list me daalo
            } else {
                neg.add(num); // Negative list me daalo
            }
        }

        // ✅ Step 2: Alternate form me bharo original array me
        int i = 0; // arr[] ke index ke liye
        int p = 0; // pos list ke index ke liye
        int n = 0; // neg list ke index ke liye

        // Jab tak dono list me elements bache hain, alternate bharo
        while (p < pos.size() && n < neg.size()) {
            arr[i++] = pos.get(p++);  // Pehle positive
            arr[i++] = neg.get(n++);  // Phir negative
        }

        // ✅ Step 3: Agar koi list me elements bache ho, to unko bhi daal do

        while (p < pos.size()) {
            arr[i++] = pos.get(p++); // Bache hue positive
        }

        while (n < neg.size()) {
            arr[i++] = neg.get(n++); // Bache hue negative
        }
    }

    public static void main(String[] args) {
        // 🎯 Sample Input
        int[] arr = {1, 2, 3, -4, -1, 4};

        // ✅ Function call to rearrange array
        rearrange(arr);

        // 🔍 Output print karo
        System.out.println("📌 Rearranged Array: " + Arrays.toString(arr));
    }
}
