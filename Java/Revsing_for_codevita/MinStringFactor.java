import java.util.Scanner;

public class MinStringFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine().trim();
        String Y = scanner.nextLine().trim();
        String reversedY = new StringBuilder(Y).reverse().toString();
        String[] costInput = scanner.nextLine().trim().split(" ");
        int S = Integer.parseInt(costInput[0]);
        int R = Integer.parseInt(costInput[1]);
        int n = X.length();
        int m = Y.length();
        
        int[] dpY = new int[n + 1];
        int[] dpRevY = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dpY[i] = dpRevY[i] = Integer.MAX_VALUE;
        }
        dpY[0] = dpRevY[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int start = Math.max(0, i - m); start < i; start++) {
                if (Y.contains(X.substring(start, i))) {
                    dpY[i] = Math.min(dpY[i], dpY[start] + 1);
                }
                if (reversedY.contains(X.substring(start, i))) {
                    dpRevY[i] = Math.min(dpRevY[i], dpRevY[start] + 1);
                }
            }
        }

        int minSubstrings = Math.min(dpY[n], dpRevY[n]);
        if (minSubstrings == Integer.MAX_VALUE) {
            System.out.println("Impossible");
        } else {
            int stringFactor;
            if (dpY[n] < dpRevY[n]) {
                stringFactor = dpY[n] * S;
            } else {
                stringFactor = dpRevY[n] * R;
            }
            System.out.println(stringFactor);
        }
        scanner.close();
    }
}
