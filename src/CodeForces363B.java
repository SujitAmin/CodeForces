import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeForces363B {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i =0 ; i <N;i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        int[] dp =  new int[N + 1];
        //make prefix table
        for(int i = 1 ; i <=N; i++){
            dp[i] = dp[i - 1] + arr[i - 1];
        }
        int min = Integer.MAX_VALUE;
        int pos = 0;
        // we need starting postition
        for(int i= 0 ; i <=(N - k);i++){
            if(dp[i + k] - dp[i] < min){
                min = dp[i + k] - dp[i];
                pos = i + 1;
            }
        }
        System.out.println(pos);
    }
}
