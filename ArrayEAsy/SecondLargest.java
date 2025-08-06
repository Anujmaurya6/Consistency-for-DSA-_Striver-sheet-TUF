package ArrayEAsy;



public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={23,32,12,21,67,76,87,11};
        int n=arr.length;

    int largest=Integer.MIN_VALUE;
    int seclargest=Integer.MIN_VALUE;

    for(int num:arr){
        if(num>largest){
            seclargest=largest;
           largest=num;
        }else if(num>seclargest && num!=largest){
            seclargest=num;
        }
         if (seclargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element nahi mila (shayad sab values same hain).");
        } else {
            System.out.println("Dusra sabse bada element hai: " + seclargest);
        }
    }
}}
