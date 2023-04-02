import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String49 {

    public static void main(String[] args) {
        String str = "МИНИМУМ";

        String result =
                Stream.of(str.split(" ")).map(String49::replaceWord).collect(Collectors.joining(" "));

        System.out.println(result);
    }

    static String replaceWord(String input) {
        if (input.length() > 0) {
            return input.replace(input.charAt(input.length() - 1), '.').substring(0, input.length() - 1)
                    + input.charAt(input.length() - 1);
        } else {
            return input;
        }
    }
}
