package co.edu.parquesoft.ciclos;

import java.util.Scanner;

public class CiclosEjercicio {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Ingrese el número de la tabla de multiplicar: ");
        int tabla = sc.nextInt();

        IO.println("Ingrese el número hasta el que quiere multiplicar la tabla anterior: ");
        int numero = sc.nextInt();

        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado = tabla * i;
            IO.println(tabla + " * " + i + " = " + resultado);
        }
    }
}
