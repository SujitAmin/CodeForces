import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*
Polycarpus has a ribbon, its length is n. He wants to cut the ribbon in a way that fulfils the following two conditions:

    After the cutting each ribbon piece should have length a, b or c.
    After the cutting the number of ribbon pieces should be maximum.

Help Polycarpus and find the number of ribbon pieces after the required cutting.
Input

The first line contains four space-separated integers n, a, b and c (1 ≤ n, a, b, c ≤ 4000) — the length of the original ribbon and the acceptable lengths of the ribbon pieces after the cutting, correspondingly. The numbers a, b and c can coincide.
Output

Print a single number — the maximum possible number of ribbon pieces. It is guaranteed that at least one correct ribbon cutting exists.
*/
/*
The problem is to maximize x+y+z subject to ax+by+cz=n. Constraints are low, so simply iterate over two variables (say x and y) and find the third variable (if any) from the second equation. Find the maximum over all feasible solutions.
Other approaches: Use dynamic programming with each state being the remainder of ribbon. Select the next piece to be a, b or c.
* */
public class CutRibbon {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] cuts = new int[3];
        cuts[0] = a;
        cuts[1] = b;
        cuts[2] = c;
        Arrays.sort(cuts);
        int[] dp =new int[4000 + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0 ;
        dp[cuts[0]]= 1;
        dp[cuts[1]] = 1;
        dp[cuts[2]] = 1;
        //dp solution
        for(int i = 1; i<=N;i++){
            for(int j = 0 ; j<3;j++){
                if(cuts[j] > i) break;
                dp[i] = Math.max(dp[i  - cuts[j] ] + 1, dp[i]);
            }
        }
        System.out.println(dp[N]);
    }
}
