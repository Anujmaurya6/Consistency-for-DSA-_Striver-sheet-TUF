package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class UNION {
    public static void main(String[] args) {
        int [] arr1={1,2,4,5,6};
        int [] arr2={2,3,5,7};

        int i=0;
        int j=0;
        int curr;
        List<Integer> unionList =new ArrayList<>();

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]< arr2[j]){
                curr=arr1[i];
                i++;
            }else if(arr1[i]>arr2[j]){
                curr=arr2[j];
                j++;
            }else{
                curr=arr1[i];
                i++;
                j++;
            }

            //step 2 : add to unionlist only if last element is different 
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != curr) {
                unionList.add(curr);
            }
        }

             // Step 3: add remaining elements from arr1
        while (i < arr1.length) {
            if (unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        // Step 4: add remaining elements from arr2
        while (j < arr2.length) {
            if (unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }
            System.out.println("Union: " + unionList);
}}