import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CodeForces433B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] sorted = new long[n+1];
        long[] dp = new long[n+1];
        long c = 0;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            sorted[i] = a;
            c += a;
            dp[1 + i] = c;
        }
        Arrays.sort(sorted);
        for(int i = 0; i < n; i++) sorted[i+1] += sorted[i];
        int q = scan.nextInt();
        while(q --> 0){
            int t = scan.nextInt(), l = scan.nextInt(), r = scan.nextInt();
            System.out.println(t == 1?dp[r]-dp[l-1]:sorted[r]-sorted[l-1]);
        }
    }
}
