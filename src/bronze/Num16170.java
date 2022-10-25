package bronze;

import java.time.LocalDate;

public class Num16170 {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        String []s = date.toString().split("-");
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);

    }
}
