public class String10 {
    static String reverse(String in, String out) {
        return (in.isEmpty()) ? out :
                (in.charAt(0) == ' ')
                        ? out + ' ' + reverse(in.substring(1), "")
                        : reverse(in.substring(1), in.charAt(0) + out);
    }
    public static void main(String args[]) {
        System.out.println(reverse("Hello World", ""));
    }
}
