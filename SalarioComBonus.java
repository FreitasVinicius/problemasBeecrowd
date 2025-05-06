import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salarioFixo;
        double totalVendas;
        double porcentagem;
        double total;


        nome = scanner.nextLine();
        salarioFixo = scanner.nextDouble();
        totalVendas = scanner.nextDouble();

        porcentagem = (totalVendas * 15 / 100);
        total = salarioFixo + porcentagem;

        System.out.printf("TOTAL = R$ %.2f\n", total);

    }
}