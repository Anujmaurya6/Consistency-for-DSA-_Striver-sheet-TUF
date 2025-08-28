package ARRAY;
import java.util.*;
public class ArrayCRUD {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60};
            //idhar ab me update karunga insert karunga bas
            int updateindex=2;
            int value=69;
            arr[updateindex]=value;

        System.out.println("the update value is"+Arrays.toString(arr));

      // ab me karunga traverse
    for(int i=0;i<arr.length;i++){
        System.out.println("the traverse is"+arr[i]);
    }

    //ab me karunga insert karunga matlab ki (ek new array banaunga)
      int index=5;
      int dalnavalue=63;
      int []newArray=new int[arr.length+1];
      
      arr[index]=dalnavalue;
      for(int i=0,j=0;i<newArray.length;i++){
       if(i==index){
        newArray[i]=index;
       }else{
        newArray[i]=j++;
       }
    }
    System.out.println("the inserted us"+Arrays.toString(arr));

    //ab me karunga delete

    int deleteindex=1;
   int[]smallerarray=new int[arr.length-1];

   for(int i=0,j=0;i<smallerarray.length;i++){
    if(j==deleteindex){
        j++;
    }
    smallerarray[i]=arr[j++];
    }
    arr=smallerarray;
     System.out.println("After Deletion:"+Arrays.toString(arr));
   

   //ab me idhar search karunga ok
   int searchvalue=69;
   boolean isfound=false;
   for(int i=0,j=0;i<arr.length;i++){
    if(arr[i]==searchvalue){
        isfound=true;
        System.out.println("the qureka element is found"+searchvalue);
        break;
    }
    if(!isfound){
        System.out.println("The index is not found"+Arrays.toString(arr));
    }
   }
//ab sorting karne ke liye kaise karunnga bas built in fucntion ka use
Arrays.sort(arr);
System.out.println("the answer after sorting is"+Arrays.toString(arr));


}
}
