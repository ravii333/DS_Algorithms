package com.ravi.Competitive_Programming;
import java.util.*;
public class StringFormation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String X = scanner.nextLine();
        String Y = scanner.nextLine();
        int S = scanner.nextInt();
        int R = scanner.nextInt();

        int result = calculateMinimumStringFactor(X, Y, S, R);

        if (result == Integer.MAX_VALUE) {
            System.out.print("Impossible");
        } else {
            System.out.print(result);
        }
    }

    private static int calculateMinimumStringFactor(String X, String Y, int S, int R) {
        int n = X.length();
        int m = Y.length();

        String reversedY = new StringBuilder(Y).reverse().toString();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int len = 1; len <= m && i - len >= 0; len++) {
                String subX = X.substring(i - len, i);

                // Match with Y
                if (Y.contains(subX)) {
                    if (dp[i - len] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - len] + S);
                    }
                }

                // Match with reversed Y
                if (reversedY.contains(subX)) {
                    if (dp[i - len] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - len] + R);
                    }
                }
            }
        }

        return dp[n];
    }
}

