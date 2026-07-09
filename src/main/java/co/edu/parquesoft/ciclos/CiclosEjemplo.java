package co.edu.parquesoft.ciclos;

import java.util.Scanner;

public class CiclosEjemplo {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        // Pedir un numero $numero y sumar todos los numeros desde el uno hasta $numero
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        IO.println("El total es " + suma);

    }
}
