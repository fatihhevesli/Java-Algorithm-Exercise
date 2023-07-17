public class Main {

    public static void main(String[] Args){
      int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int price : prices){
            minValue = Math.min(price,minValue);
            maxProfit = Math.max(maxProfit,price - minValue);
        }
        return maxProfit;
    }
}