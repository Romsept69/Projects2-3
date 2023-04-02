public class String59 {
    public static void main(String[] args) {
        fooBar0("C:/Program Files/7-Zip/7z.exe");
    }
    static void fooBar0(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                sb.append(ch).append(' ');
            }
        }
        System.out.println(sb.toString());
    }
}
