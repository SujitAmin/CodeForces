import java.util.Scanner;

public class Hulk705A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str ="";
        String hate = "I hate ";
        String love = "I love ";
        int N = sc.nextInt();
        if(N == 1){
            System.out.println("I hate it");
            return;

        }
        for(int i = 0 ; i< N - 1;i++){
            if((i % 2) == 0)
                System.out.print(hate + "that ");
            else
                System.out.print(love + "that ");
        }
        if(N%2 == 0)
            System.out.print(love +"it");
        else
            System.out.print(hate +"it");

    }
}
