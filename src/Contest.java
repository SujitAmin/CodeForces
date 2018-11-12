import com.sun.org.apache.bcel.internal.generic.RET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Contest {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]) - 1;
        String[] fir = br.readLine().split(" ");
        String[] sec = br.readLine().split(" ");
        int[] first = new int[N];
        int[] second = new int[N];
        for(int i = 0 ; i<N;i++){
            first[i] = Integer.parseInt(fir[i]);
        }
        for(int i = 0 ; i<N;i++){
            second[i] = Integer.parseInt(sec[i]);
        }
        if(first[0] == 0){
            System.out.println("NO");
            return;
        }
        if(first[s] > 0){
            System.out.println("YES");
            return;
        }
        if(second[s] == 0){
            System.out.println("NO");
            return;
        }
        for(int i = s + 1 ; i < N;i++){
            if(first[i] > 0 && second[i] > 0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}
