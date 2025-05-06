import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A;
        double B;
        double C;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        double MEDIA = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}