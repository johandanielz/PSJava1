package co.edu.parquesoft.scanner;

import java.util.Scanner;

public class ScannerEjemplo {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Ingrese el primer número: ");
        double primerNumero = sc.nextDouble();

        IO.println("Ingrese el segundo número: ");
        double segundoNumero = sc.nextDouble();

        double suma = primerNumero + segundoNumero;
        double resta = primerNumero - segundoNumero;

        IO.println("La suma de " + primerNumero + " + " + segundoNumero + " = " + suma);
        IO.println("La resta de " + primerNumero + " - " + segundoNumero + " = " + resta);

    }
}
