import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
O(N) method: For achieve this complexity, we need to make an observation. Suppose I flip an interval
(it does not matter what interval, it can be any interval). Also suppose that S is the number of ones before flipiing it.
What happens? Every time I flip a 0 value, S increases by 1 (I get a new 1 value).
Every time I flip a 1 value, S decreases by 1 (I loose a 1 value). What would be the “gain” from a flip?
I consider winning “+1” when I get a 0 value and “-1” when I get a 1 value.
The “gain” would be simply a sum of +1 and -1.
This gives us idea to make another vector b[]. B[i] is 1 if A[i] is 0 and B[i] is -1 if A[i] is 1.
We want to maximize S + gain_after_one_move sum. As S is constant, I want to maximize gain_after_one_move.
In other words, I want to find a subsequence in b[] which gives the maximal sum. If I flip it, I get maximal number of 1s too.
This can be founded trivially in O(N ^ 2). How to get O(N)? A relative experienced
programmer in dynamic programming will immediately recognize it as a classical problem “subsequence of maximal sum”.
If you never heard about it, come back to this approach after you learn it.
*/
/*
Iahub got bored, so he invented a game to be played on paper.

He writes n integers a1, a2, ..., an. Each of those integers can be either 0 or 1. He's allowed to do exactly one move: he chooses two indices i and j (1 ≤ i ≤ j ≤ n) and flips all values ak for which their positions are in range [i, j] (that is i ≤ k ≤ j). Flip the value of x means to apply operation x = 1 - x.

The goal of the game is that after exactly one move to obtain the maximum number of ones. Write a program to solve the little game of Iahub.
Input

The first line of the input contains an integer n (1 ≤ n ≤ 100). In the second line of the input there are n integers: a1, a2, ..., an. It is guaranteed that each of those n values is either 0 or 1.
Output

Print an integer — the maximal number of 1s that can be obtained after exactly one move.
Examples
Input
Copy

5
1 0 0 1 0

Output
Copy

4

Input
Copy

4
1 0 0 1

Output
Copy

4

Note

In the first case, flip the segment from 2 to 5 (i = 2, j = 5). That flip changes the sequence, it becomes: [1 1 1 0 1]. So, it contains four ones. There is no way to make the whole sequence equal to [1 1 1 1 1].

In the second case, flipping only the second and the third element (i = 2, j = 3) will turn all numbers into 1.
*/
public class FlippingGame {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        int res = codeforces(arr, N);
        System.out.println(res);
    }

    private static int codeforces(int[] arr, int n) {
        //max sum of contiguos subarray problem
        if(n == 1 && arr[0] == 1)
            return 0;
        int[] b = new int[n];
        int counts = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                b[i] = -1;
                counts++;
            } else if (arr[i] == 0) {
                //1 is gain for us since we want to flip 0s
                //so maximise 0s to 1
                b[i] = 1;
            }
        }
        int max_ending_here = 0;
        int max_so_far = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + b[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i + 1;

            }
            if (max_ending_here < 0) {
                //just update it 0
                max_ending_here = 0;
                s = i + 1;
            }
        }
        //just flip now
        for (int i = start; i < end; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else if (arr[i] == 1)
                arr[i] = 0;

        }
        int count = 0;
        for (int i = 0; i <n; i++) {
            if(arr[i] == 1)
                count++;
        }
        if(counts == n)
            return n - 1;
        return count;
    }
}