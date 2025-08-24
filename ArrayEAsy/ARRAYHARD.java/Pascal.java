//package ArrayEAsy.arraymedium;
//package ArrayEAsy.ARRAYHARD.java;
import java.util.*;
public class Pascal {
    public static List<List<Integer>> generate (int numRows){

    //final traigle banaunga toh list lagegi
    List<List<Integer>> triangle = new ArrayList<>();

    ///agar 0 ya negative rows manga toh khaali list return kar 
    if(numRows <= 0){
        return triangle;
    }

    //har rows ke liye loop 
    for(int i=0;i<numRows;i++){
        //nayi row banayi

        List<Integer> row =new ArrayList<>();

        //har row mein elements ke liye loop 
        for(int j=0;j<=i;j++){
            //agar pehla element hai ya last element hai 
            if(j==0 || j==i){
                row.add(1);

            }else{
                List<Integer> prev =triangle.get(i-1);//previous row
                int left=prev.get(j-1); //above left
                int right =prev.get(j); //above right
                int val =left+right;//sum 
                row.add(val);
            }
        }
        //puri row ko triangle me add karo ok 
        triangle.add(row);
    }
return triangle;

}

    public static void main(String[] args) {
        int numRows=6;
    List<List<Integer>> result= generate(numRows);

    //har row ko alag alag line me print karne ke liye bhai idhar
    for(List<Integer> row:result){
        System.out.println(row);
    }
    }

}
