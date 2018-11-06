import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class CodeForces706B {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[]  str = br.readLine().split(" ");
        int[] arr = new int[N];
        int prefix_sum[] = new int[1000010];
        for(int i = 0; i< N;i++){
            arr[i] = Integer.parseInt(str[i]);
            prefix_sum[arr[i]]++;
        }
        int Q = Integer.parseInt(br.readLine());
        int[] query = new int[Q];
        for(int i = 0; i<Q; i++){
            query[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 1 ; i<1000010;i++){
            prefix_sum[i] += prefix_sum[i - 1];
        }
        for(int i = 0 ; i<Q;i++){
            int money = query[i];
            int x = Math.min(1000000, money);
            System.out.println(prefix_sum[x]);

        }

    }

}
