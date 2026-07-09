package co.edu.parquesoft.ciclos;

public class CiclosTarea {
    static void main() {

        int resultado = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            IO.println(i);
            resultado += i;
        }

        IO.println("El resultado es: " + resultado);
    }
}
