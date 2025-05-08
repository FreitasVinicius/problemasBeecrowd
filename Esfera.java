import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);


        System.out.printf("VOLUME = %.3f%n", volume);


        scanner.close();
    }
}