import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InSearchofanEasyProblem1030A {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < N; i++) {
            if(arr[i] == 1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
