package ArrayEAsy.arraymedium;

public class StockbuySell {

    // Function to calculate maximum profit from single buy and sell
    public static int maxProfit(int[] prices) {

        // ✅ Yeh variable track karega sabse sasta price — jaha tak ab tak hum buy kar sakte the
        int minPrice = Integer.MAX_VALUE;  // Initially set to very large, so pehla price replace kar de

        // ✅ Yeh variable final answer hai — ab tak ka best profit yaha store hoga
        int maxProfit = 0;  // Initially 0, because profit negative nahi ho sakta

        // ✅ Loop chalayenge pure array pe — har din ka price check karne ke liye
        for (int i = 0; i < prices.length; i++) {

            // ✅ Aaj ka stock price
            int priceToday = prices[i];

            // ✅ Agar aaj ka price ab tak ke lowest se bhi kam hai, toh update kar denge
            if (priceToday < minPrice) {
                minPrice = priceToday;  // Buy point update ho gaya — sabse sasta mila
            }

            // ✅ Calculate current profit — agar aaj bech dete toh kya milta?
            int profitToday = priceToday - minPrice;

            // ✅ Agar aaj ka profit ab tak ke max profit se zyada hai, toh update kar do
            if (profitToday > maxProfit) {
                maxProfit = profitToday;  // New max profit found
            }
        }

        // ✅ Return final answer — sabse achha profit jo milega ek hi baar buy-sell se
        return maxProfit;
    }

    // Driver method
    public static void main(String[] args) {

        // ✅ Example input: stock prices on different days
        int[] prices = {7, 1, 5, 3, 6, 4};

        // ✅ Function call to calculate maximum profit
        int result = maxProfit(prices);

        // ✅ Output final result
        System.out.println("📈 Maximum Profit: " + result);
    }
}
