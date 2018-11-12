import java.util.Scanner;

public class WrongSubtraction977A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        while(k --> 0){
            if(N%10 == 0){
                N = N/10;
            }else{
                N = N - 1;
            }
        }
        System.out.println(N);

    }
}
