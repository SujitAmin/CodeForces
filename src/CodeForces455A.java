import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Alex doesn't like boredom. That's why whenever he gets bored, he comes up with games. One long winter evening he came up with a game and decided to play it.

Given a sequence a consisting of n integers. The player can make several steps. In a single step he can choose an element of the sequence (let's denote it ak) and delete it, at that all elements equal to ak + 1 and ak - 1 also must be deleted from the sequence. That step brings ak points to the player.

Alex is a perfectionist, so he decided to get as many points as possible. Help him.
Input

The first line contains integer n (1 ≤ n ≤ 105) that shows how many numbers are in Alex's sequence.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 105).
Output

Print a single integer — the maximum number of points that Alex can earn.
*/
/*
In this task we need to maximize the sum of numbers that we took. Let precalc array cnt. cnt[x] — number of integers x in array a. Now we can easily calculate the DP:
f(i) = max(f(i - 1), f(i - 2) + cnt[i]·i), 2 ≤ i ≤ n;
f(1) = cnt[1];
f(0) = 0;
The answer is f(n).
*/
public class CodeForces455A {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i = 0;i < N;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        long res = codeforces(arr,N);
        System.out.println(res);
    }

    private static long codeforces(int[] arr, int n) {
        if(n== 0)
            return 0;
        if(n == 1)
            return arr[0];
        long hash_dp[] = new long[100001];
        for(int i = 0 ; i < n; i++){
            hash_dp[arr[i]] = hash_dp[arr[i]] + arr[i];
        }
        for(int i = 2  ; i < 100001;i++){
            //either previous sum or current sum
            hash_dp[i] = Math.max(hash_dp[i] + hash_dp[i - 2], hash_dp[i - 1]);
        }
        return hash_dp[100000];
    }
}
