import java.util.Scanner;

public class Day30_LongestCommonSubsequence {

    public static int lcs(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static String getLCSString(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                lcs.append(text1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String text2 = scanner.nextLine();

        System.out.println("String 1: " + text1);
        System.out.println("String 2: " + text2);

        int length = lcs(text1, text2);
        System.out.println("Length of LCS: " + length);

        String lcsString = getLCSString(text1, text2);
        System.out.println("LCS: " + lcsString);

        System.out.println("\n--- Test Cases ---");
        String[][] testCases = {
                { "abcde", "ace" },
                { "abc", "abc" },
                { "abc", "def" },
                { "AGGTAB", "GXTXAYB" }
        };

        for (String[] test : testCases) {
            int result = lcs(test[0], test[1]);
            String resultStr = getLCSString(test[0], test[1]);
            System.out.println(
                    "\"" + test[0] + "\" & \"" + test[1] + "\" -> Length: " + result + ", LCS: \"" + resultStr + "\"");
        }

        scanner.close();
    }
}