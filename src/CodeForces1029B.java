import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeForces1029B {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String []temp = br.readLine().split(" ");
        for(int i = 0 ; i<N;i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        int i = 0;
        int j = 0;
        int ans = 1;
        while(i <N){
            j = i ;
            while((j+1 < N)&& arr[j + 1]  <= arr[j]*2){
                j++;
            }
            if(ans < (j - i + 1)){
                ans = j - i + 1;
            }
            i = j;
            i++;
        }
        System.out.println(ans);
    }

}
