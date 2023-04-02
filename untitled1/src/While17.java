import  java.util.*;
import java.util.Scanner;

public class While17 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите N = ");
        int N = in.nextInt();


        while (N>0)
        {

            N = (N - (N % 10)) / 10;
            N= N % 10;
            System.out.println(N );

        }
    }
}