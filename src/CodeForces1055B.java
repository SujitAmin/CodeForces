import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeForces1055B {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int query = sc.nextInt();
        int favno = sc.nextInt();
        long [] a = new long[N];
        int answer = 0;
        for(int i = 0 ; i < N ;i++){
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] > favno) {
                if (i + 1 == N || a[i + 1] <= favno) {
                    answer++;
                }
            }
        }
        for (int i = 0; i < query; i++) {
            int t = sc.nextInt();
            if (t == 0) {
                System.out.println(answer);
            } else {
                int p = sc.nextInt() - 1;
                int d = sc.nextInt();
                if (a[p] <= favno && a[p] + d > favno) {
                    answer++;
                    if (p > 0 && a[p - 1] > favno) {
                        answer--;
                    }
                    if (p + 1 < N && a[p + 1] > favno) {
                        answer--;
                    }
                }
                a[p] += d;
            }
        }
    }

}
