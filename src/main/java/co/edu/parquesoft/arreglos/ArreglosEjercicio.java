package co.edu.parquesoft.arreglos;

import java.util.Scanner;

public class ArreglosEjercicio {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            IO.println("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double min = 5;
        double max = 0;
        double suma = 0;
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
            if (nota > max) {
                max = nota;
            }
            suma += nota;
        }

        double promedio = suma / notas.length;
        IO.println("El promedio es: " + promedio);
        IO.println("La nota mas baja es: " + min);
        IO.println("La nota mas alta es: " + max);

    }
}
