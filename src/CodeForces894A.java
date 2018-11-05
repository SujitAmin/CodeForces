import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeForces894A {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = codeforces(str);
        System.out.println(res);
    }

    private static int codeforces(String str) {
        int count = 0;
        int N = str.length();
        for(int i = 0 ;i < N - 2;i++){
            for(int j = i + 1 ; j < N - 1;j++){
                for(int k = j + 1 ; k < N ; k++){
                    if(str.charAt(i)=='Q' && str.charAt(j)=='A' && str.charAt(k)=='Q'){
                      count++;
                    }
                }
            }
        }
        return count;
    }
}