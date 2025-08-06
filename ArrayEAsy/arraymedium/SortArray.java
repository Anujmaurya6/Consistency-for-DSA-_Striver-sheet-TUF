package ArrayEAsy.arraymedium;
/*Ye koi normal sorting question nahi hai

Ye ek special case ka sorting hai — jisme input hamesha 0, 1, 2 hi honge */
/*-- isliye laga rahe hain kyunki:

Tumne pehle count kiya tha kitne 0s, 1s, 2s hain

Ab tum ek ek karke unko likh rahe ho aur har likhne ke baad ek count ghata rahe ho

Jab count 0 ho jaata hai, tab loop ruk jaata hai ✅ */
public class SortArray {
    public static void sortcolors(int []arr) {
     int low = 0, mid = 0, high = 0;

        //count 0s,1s and 2s in the given array
        for(int num:arr){
            if(num==0){
                low++;
            }else if(num==1){
                mid++;
            }else{
                high++;
            }
        }
        //idhar mera low ka matlab he ki mene pure array me kitni baar dala hu 0 yeh bata rha he idhar mera
        //idhar mera medium yeh bata rha he ki idahr mera kitni baar mene pure array me 1 dala hu bas 
            //overWrite the same array in sorted array
            int index=0;
            while(low-->0) arr[index++]=0;
            while(mid-->0) arr[index++]=1;
            while(high-->0) arr[index++]=2;
        }
          public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        sortcolors(arr); // sort original array

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /*pehle hum idhar basically check karte he ki idhar mera zero one two kitni baar he babbar then hum
     * idhar jitni baar bhi mera zero one two he utni baar mera idhar woh gin chuka hoga barabar then mera idhar 
     * kitni baar zero one two he babrbr then ek ek kam karnge hum
     * 
    */
}
