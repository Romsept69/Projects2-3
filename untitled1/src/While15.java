import java.util.Scanner;
public class While15 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double currentContribution = 1000;
        double finalContribution = 1100;

        System.out.print("Введите процент:");
        double persent = scanner.nextDouble();

        boolean isOkValuePercent = persent > 0 && persent <= 25;
        if (!isOkValuePercent) {
            return;
        }

        int countMonths = 0;
        while (currentContribution < finalContribution) {
            currentContribution *= 1 + persent / 100;
            System.out.println("После " + ++countMonths + " - " + currentContribution);
        }

        System.out.println("После " + countMonths + " в данном месяце ваш вклад саоставляет> " + finalContribution
                + " и будет = " + currentContribution);
    }
}