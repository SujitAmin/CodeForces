import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleStrings665C {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        String res = codeForces(chars);
        System.out.println(res);
    }

    private static String codeForces(char[] str) {

        for(int i = 1 ; i < str.length;i++){
                if( str[i - 1] == str[i]){
                    str[i]++;
                    if(str[i] > 'z') str[i] = 'a';
                    if(i + 1 < str.length && str[i] == str[i + 1]){
                        str[i]++;
                        if(str[i] > 'z') str[i] = 'a';
                    }
                }


        }
        String res = new String(str);
        return res;
    }
}
