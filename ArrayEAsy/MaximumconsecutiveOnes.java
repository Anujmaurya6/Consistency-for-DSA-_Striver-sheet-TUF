package ArrayEAsy;

public class MaximumconsecutiveOnes {
    //Ek array diya gaya hai sirf 0 aur 1 se bhara hua.
//Tu ko continuous 1s ki sabse badi chain dhoondhni hai.
public static void main(String[] args) {
    int []arr={1,1,0,1,1,1};

    int maxcount=0;
    int currentcount=0;

    //traverse array
    for(int num:arr){
        if(num==1){
            currentcount++;
            if(currentcount>maxcount){
                maxcount=currentcount;
            }
            else{
                currentcount=0;
            }
        }
        System.out.println(""+maxcount);
    }
}











}
