package co.edu.parquesoft.scanner;

import java.util.Scanner;

public class ScannerEjercicio {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Ingrese el primer número: ");
        double primerNumero = sc.nextDouble();

        IO.println("Ingrese el segundo número: ");
        double segundoNumero = sc.nextDouble();

        double suma = primerNumero + segundoNumero;
        double resta = primerNumero - segundoNumero;
        double multiplicacion = primerNumero * segundoNumero;
        double division = 0.0;
        double modulo = 0.0;
        if (segundoNumero == 0) {
            IO.println("Error: No se puede dividir por cero");
        } else {
            division = primerNumero / segundoNumero;
            modulo = primerNumero % segundoNumero;
        }

        IO.println("La suma de " + primerNumero + " + " + segundoNumero + " = " + suma);
        IO.println("La resta de " + primerNumero + " - " + segundoNumero + " = " + resta);
        IO.println("La multiplicación de " +  primerNumero + " * " + segundoNumero + " = " + multiplicacion);
        IO.println("La división de " + primerNumero + " / " + segundoNumero + " = " + division);
        IO.println("El modulo de " + primerNumero + " % " + segundoNumero + " = " + modulo);

    }
}
