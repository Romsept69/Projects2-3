public class String54 {
    public static void main(String[] args) {


        String stringToProc= "Количество гласных";


        char[] vocalArr = new char[]{'м', 'а', 'м', 'а', 'м', 'ы', 'л', 'а', 'р', 'а', 'м' , 'у'};


        int counter = -1;


        char[] arrayToProc = stringToProc.toCharArray();


        for (char ch : arrayToProc) {
            for (char ch2 : vocalArr) {
                if (ch == ch2){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
