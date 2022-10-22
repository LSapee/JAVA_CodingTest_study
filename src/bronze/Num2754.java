package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double a = 0.0;

        switch (s.charAt(0)) {
            case 'A':
                a = 4.0;
                if (s.charAt(1) == '+')
                    a += 0.3;
                else if (s.charAt(1) == '-')
                    a -= 0.3;
                break;
            case 'B':
                a = 3.0;
                if (s.charAt(1) == '+')
                    a += 0.3;
                else if (s.charAt(1) == '-')
                    a -= 0.3;
                break;
            case 'C':
                a = 2.0;
                if (s.charAt(1) == '+')
                    a += 0.3;
                else if (s.charAt(1) == '-')
                    a -= 0.3;
                break;
            case 'D':
                a = 1.0;
                if (s.charAt(1) == '+')
                    a += 0.3;
                else if (s.charAt(1) == '-')
                    a -= 0.3;
                break;
            default:
                break;
        }
        System.out.println(a);
    }
}
