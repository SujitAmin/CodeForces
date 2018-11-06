import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CodeForces368B {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] arr = new int[N];
        String[] strs = br.readLine().split(" ");
        for(int i = 0 ; i<N;i++){
            arr[i] = Integer.parseInt(strs[i]);
        }
        int[] dp = new int[N];
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i = N - 1 ; i >= 0;i--){
            hash.add(arr[i]);
            dp[i] = hash.size();
        }
        for(int i = 0 ; i < M; i++){
            int no = Integer.parseInt(br.readLine());
            System.out.println(dp[no - 1]);
        }
    }

}
