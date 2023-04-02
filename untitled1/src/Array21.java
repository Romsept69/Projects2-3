import java.util.Scanner;
public class Array21
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] A;
        System.out.print("N = ");
        int n = in.nextInt();
        System.out.print("K = ");
        int k = in.nextInt();
        System.out.print("L = ");
        int l = in.nextInt();
        A = new int [n];
        for(int i = 0;i < n ;i++){
            System.out.print("enter A [ " + i +"] = ");
            A[i] = in.nextInt();
        }
        float sum = 0;
        for(int i = k; i<=l; i++) sum += A[i];

        System.out.print(((sum)/(l-k+1)));

    }
}