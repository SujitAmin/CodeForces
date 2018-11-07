import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeForces919B {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = codeforces(N);
        System.out.println(res);
    }

    private static int codeforces(int n) {
        int i = 19;
        for(i = 19 ;  n!= 0 ;i++){
            int no = i;
            long sum = 0;
            while(no > 0){
                sum = sum + no%10;
                no = no/10;
            }
            if(sum == 10){
                n--;
            }
        }
        return  i -1;
    }
}
