import java.util.Scanner;

public class String38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String s = "cat rat cat", s1 = "cat", s2 = "bat";
        s = s.replaceAll(s1, s2);

        s = s.replaceAll(s1, s2);
        System.out.println(s);
    }
}
