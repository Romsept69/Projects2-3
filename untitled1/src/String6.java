import java.util.Scanner;
public class String6 {
    private static final char[] latinSymbols = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private static final char[] russianSymbols = {'А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т'};
    private static final char[] digits = {'0','1','2','3','4','5','6','7','8','9'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите символ: ");
        char character = sc.nextLine().toCharArray()[0];

        System.out.println(identifySymbol(character));
    }

    public static String identifySymbol(char character) {
        for(char c : latinSymbols) {
            if(c == character) {
                return "latin symbol";
            }
        }

        for(char c : russianSymbols) {
            if(c == character) {
                return "russian symbol";
            }
        }

        for(char c : digits) {
            if(c == character) {
                return "digit";
            }
        }

        return null;
    }
}
