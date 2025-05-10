import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distancia / combustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);

        scanner.close();
    }
}