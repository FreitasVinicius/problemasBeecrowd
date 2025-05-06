import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NUMBER;
        int horasTrabalhadas;
        double valorHora;
        double SALARY;

        NUMBER = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorHora = scanner.nextDouble();

        SALARY = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);

    }
}