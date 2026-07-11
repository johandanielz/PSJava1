package co.edu.parquesoft.metodos;

import java.util.Scanner;

public class MetodosEjemplo {

    // Metodo de sumar
    static double sumar(double a, double b) {
        return a + b;
    }
    // Metodo restar
    static double restar(double a, double b) {
        return a - b;
    }
    // Metodo multiplicar
    static double multiplicar(double a, double b) {
        return a * b;
    }
    // Metodo dividir
    static double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Ingrese el primer numero: ");
        double a = sc.nextDouble();
        IO.println("Ingrese el segundo numero: ");
        double b = sc.nextDouble();

        IO.println("La suma de " + a + " + " + b + " es: " + sumar(a, b));
        IO.println("La resta de " + a + " - " + b + " es: " + restar(a, b));
        IO.println("La multiplicacion de " + a + " * " + b + " es: " + multiplicar(a, b));
        IO.println("La division de " + a + " / " + b + " es: " + dividir(a, b));
    }
}
