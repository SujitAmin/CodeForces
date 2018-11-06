import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeForces400A {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String order = br.readLine();
        int res = codeforces(order,N);
        System.out.println(res);
    }

    private static int codeforces(String order, int n) {
        int x = 0;
        int y = 0;
        int res  = 0;
        for(int i =0 ;i<n;i++){
            if(order.charAt(i) == 'L'){
                x--;
            }

            else if(order.charAt(i) == 'R'){
                x++;
            }
            else if(order.charAt(i) == 'U'){
                y++;
            }
            else if(order.charAt(i) == 'D'){
                y--;
            }
        }
        res = n - Math.abs(x) - Math.abs(y);
        return res;
    }
}
