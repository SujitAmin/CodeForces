import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//codeforces 996A
public class Main
{
    // m is size of coins array (number of different coins)
    private static int minCoins(int[] coins, int m, int V) {
        if(V <= 0){
            return 0;
        }
        int coin = 0;
        for(int j = m - 1 ;j>=0;j--){
                if(V >= coins[j]) {
                    coin = coin + (V/(coins[j]));
                    V = V % coins[j];
                }
               //coin = 0 + 125 /100
        }

        return coin;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        int res = minCoins(new int[]{1, 5, 10, 20, 100}, 5,N);
        System.out.println(res);
    }
}
