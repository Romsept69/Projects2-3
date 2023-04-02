import java.util.Arrays;

public class String32 {
    public static void main(String[] args) {
        String str = "Multiple findme classes and nested " +
                "static findme classes are supported, " +
                "Printing unwanted or ill-formatted data " +
                "to output will cause the test findme cases " +
                "to fail findme";

        String substr = "findme";

        Long count = Arrays.stream(str.split(" "))
                .filter(s -> s.contains(substr))
                .count();
        System.out.println(count);
    }
}
