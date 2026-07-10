package co.edu.parquesoft.arreglos;

import java.util.Scanner;

public class ArreglosEjemplo {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            IO.println("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        double promedio = suma / notas.length;
        IO.println("El promedio es: " + promedio);

    }
}
