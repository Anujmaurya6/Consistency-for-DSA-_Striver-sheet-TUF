package ArrayEAsy.String;

public class LArgestOddnumberisSTring {
    public static void main(String[] args) {
        String num="3456789";

        //start checking from end
        for(int i=num.length()-1;i>=0;i--){
            //convert character to digit
            int digit=Character.getNumericValue(num.charAt(i));
/*num.charAt(i) → Character nikalta hai (jaise '7')

Character.getNumericValue() → Is character ko number banata hai (jaise 7)

digit variable mein store hota hai */



//check if odd
 if (digit % 2 != 0) {
                System.out.println("Largest odd number: " + num.substring(0, i+1));
                return;
            }
        }
        
        // If no odd number found
        System.out.println("No odd number found");
    }
}
    
