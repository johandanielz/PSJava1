package co.edu.parquesoft.condicionales;

import java.util.Scanner;

public class CondicionalesEjemplo {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Ingrese la nota de 0 a 100: ");
        float nota = sc.nextFloat();

        if (nota >= 90) {
            IO.println("Aprobaste con honores");
        } else if (nota >= 60){
            IO.println("Aprobaste");
        } else {
            IO.println("Reprobado");
        }

    }
}
