import java.util.Scanner;

public class String28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String c  = sc.nextLine();
        System.out.println("Введите символ или строку которую надо удвоить: ");
        String s  = sc.nextLine();
        System.out.println(c.replaceAll(s, s + s));
    }

}
