public class String3 {
    public static void main(String[] args) {
        char charC = 'f';
        System.out.printf("Символ \'%c\'  стоящий перед ним %c стоящий после него %c", charC,
                (char) (charC - 1), (char) (charC + 1));
    }

}
