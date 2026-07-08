package co.edu.parquesoft.condicionales;

import java.util.Scanner;

public class CondicionalesEjercicio {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Ingresa el nombre del estudiante: ");
        String nombre = sc.nextLine();

        IO.println("Ingrese la nota de 0 a 100: ");
        int nota = sc.nextInt();

        if  (nota < 0 || nota > 100) {
            IO.println("Error: Nota invalida");
        } else if (nota >= 90){
            IO.println(nombre + ", HONOR");
        } else if (nota >= 60) {
            IO.println(nombre + ", APROBADO");
        } else if (nota >= 30) {
            IO.println(nombre + ", RECUPERA");
        } else {
            IO.println(nombre + ", REPROBADO");
        }
    }
}
