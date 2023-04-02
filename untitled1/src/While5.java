public class While5 {
    public static void main(String[] args) {
        int k = 0;
        double n = 4;

        while(n > 1) {
            n /= 2;
            k++;
        }
        if(n == 1) {
            System.out.println(k);
        } else {
            System.out.println("Данное число не является степенью 2");
        }
    }
}
