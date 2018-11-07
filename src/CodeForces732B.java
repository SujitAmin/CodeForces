import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeForces732B {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] arr = new int[N];
        String[] strs = br.readLine().split(" ");
        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }
        codeforces(arr,N,K);
    }

    private static void codeforces(int[] arr, int n, int k) {
        /*
        If we don't make enough walks during days i and i + 1,
        it's better to make an additional walk on day i + 1 because it also counts as a walk during days i + 1
        and i + 2 (and if we walk one more time on day i, it won't help us in the future).
        So we can start iterating from the second day (1"=indexed). We will add max(0, k - ai - ai - 1) walks to the day i (
        and to our answer),
        so Cormen has enough walks during days i and i - 1.
        After we have iterated through all days, we can print the answer.

        Time complexity: O(n).
        */
        int count = 0;
        int extra;
        for(int i = 1; i<n;i++){
                extra =Math.max(0,k - arr[i - 1] - arr[i]);
                count = count + extra;
                arr[i] = arr[i] + extra;
        }
        System.out.println(count);
        for(int i = 0; i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
