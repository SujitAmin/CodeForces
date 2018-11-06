import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeForces580A {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int z =0;z<N;z++){
            arr[z] = Integer.parseInt(temp[z]);
        }
        int res = CodeForces(arr,N);
        System.out.println(res);

    }
    private static int CodeForces(int[] arr, int n) {
        int max = 1;
        int res = 1;
        for(int i = 0 ; i< n - 1;i++){
            if(arr[i] <= arr[i + 1]){
                max++;
            }else{
                max = 1;

            }
            if(res < max){
                res = max;
            }
        }
        return res;
    }
}