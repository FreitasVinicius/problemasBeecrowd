import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cod1 = scanner.nextInt();
        int qtd1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int cod2 = scanner.nextInt();
        int qtd2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2);


        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}