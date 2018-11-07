import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class CodeForces313B {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int dp[] = new int[s.length()];
        //idea is to use prefix table
        for(int i = 1 ; i< s.length();i++){
            dp[i] = dp[i - 1];
            if(s.charAt(i) == s.charAt(i - 1)){
                dp[i]++;
            }
        }
        while(q --> 0){
            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            int count = 0;

            System.out.println(-1*dp[l - 1] + dp[r - 1]);

        }

    }
}
