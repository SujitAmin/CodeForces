import java.util.Scanner;
public class BearandBigBrother791A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int count = 0;
        while(true){
            if(limak > bob){
                System.out.println(count);
                return;
            }
            limak *=3;
            bob *=2;
            count++;
        }

    }
}
