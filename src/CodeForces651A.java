import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;
/*
Main idea is that each second we need to charge the joystick with lowest power level.
We can just emulate it or get an O(1) formula, because process is very simple.
*/
public class CodeForces651A {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int first = Integer.parseInt(str[0]);
        int second = Integer.parseInt(str[1]);
        int count = 0;
        if(first == 1 && second == 1){
            System.out.println(0);
            exit(0);
        }
        while(first > 0 && second > 0){
            if(first > 1 && second <= 2 ){
                second = second + 1;
                first = first - 2;

            }
            else if((second > 1) && (first <=2)){
                first = first + 1;
                second = second - 2;
            }else{
                first = first + 1;
                second = second - 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
