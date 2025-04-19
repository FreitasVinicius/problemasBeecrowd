import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double n = 3.14159;
        double area = (raio * raio) * n;

        System.out.printf("A=%.4f\n", area);

        scanner.close();

    }
}