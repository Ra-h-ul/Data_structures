package Knapsack;

public class   KP {
    public static int maxKnapsackValue(int capacity, int[] weights, int[] values, int items) {
        int[][] dp = new int[items + 1][capacity + 1];
        for (int i = 0; i <= items; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (weights[i - 1] <= w)
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[items][capacity];
    }

    public static void main(String[] args) {
        int[] values = { 12, 10, 20, 15 };
        int[] weights = { 2, 4, 3, 2 };
        int capacity = 5;
        int items = values.length;
        System.out.println("Maximum value that can be obtained: " + maxKnapsackValue(capacity, weights, values, items));
    }
}
