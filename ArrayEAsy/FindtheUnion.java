package ArrayEAsy;

import java.util.HashSet;

public class FindtheUnion {
    //Union = Dono arrays ke unique elements ka collection (repeated element sirf ek baar aata hai)
    public static void main(String[] args) {
        int []arr1={1,2,4,5};
        int []arr2={2,3,5,6};

        HashSet<Integer> unionset=new HashSet<>();

        for(int num:arr1){
            unionset.add(num);
        }
        for(int num:arr1){
            unionset.add(num);
        }
        System.out.print("Union of the arrays: ");
        for (int num : unionset) {
            System.out.print(num + " ");
    }
}
}