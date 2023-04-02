public class String18 {
    public static void main(String[] args) {
        String a = "AbCdEf";

        a = a.codePoints()
                .map(i -> Character.isUpperCase(i)
                        ? Character.toLowerCase(i)
                        : Character.toUpperCase(i))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        System.out.println(a);
    }
}
