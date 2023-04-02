public class String13 {
    public static void main(String[] args) {
        String str = "Берлин был взят в 1945";
        int lenght  = str.length() - str.replaceAll("\\d+", "").length();
        System.out.println("цифр в строке " + lenght);
    }
}
