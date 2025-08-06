package ArrayEAsy;

import java.util.HashSet;

public class Removeduplicates {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,4,5,6,7,8,8,8,9,9};
        int n=arr.length;

        HashSet<Integer> set=new HashSet<>(); 
        HashSet<Integer> duplicates=new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("unique elements"+set);
        System.out.println("Duplicates elements is"+duplicates);
    }
}

