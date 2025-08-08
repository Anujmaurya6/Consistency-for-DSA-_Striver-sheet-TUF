package ArrayEAsy.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] words = {"flower", "flow", "flight"}; // Input strings
        
        // Edge case: Agar koi word nahi diya gaya toh
        if (words == null || words.length == 0) {
            System.out.println("");
            return;
        }
        
        // Pehle word ko initial prefix maan lo
        String prefix = words[0];
        
        // Baaki sab words ke saath compare karo
        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            
            /* 
             * Yeh while loop ka kaam:
             * 1. Check karo current word prefix se shuru hota hai ya nahi
             * 2. Agar nahi, toh prefix ko ek character chota karo
             * 3. Repeat jab tak match na mile ya prefix khatam na ho jaye
             */
            while (!currentWord.startsWith(prefix)) {
                // Prefix ko ek character chota karo (last character hatao)
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // Agar prefix khatam ho gaya toh koi common nahi hai
                if (prefix.isEmpty()) {
                    System.out.println("Koi common prefix nahi hai");
                    return;
                }
            }
        }
        
        System.out.println("Sabse lamba common prefix: " + prefix);
    }
}