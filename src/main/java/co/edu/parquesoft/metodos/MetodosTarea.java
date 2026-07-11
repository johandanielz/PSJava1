package co.edu.parquesoft.metodos;

public class MetodosTarea {
    // Metodo para sumar los valores de un array
    static int sumarArray(int[] a){
        int suma = 0;
        for(int i = 0; i < a.length; i++){
            suma += a[i];
        }
        return suma;
    }

    // Metodo para sacar el promedio de los valores de un array
    static double promedioArray(int[] a){
        return sumarArray(a) / a.length;
    }

    // Metodo para sacar el valor maximo de un array
    static int maximoArray(int[] a){
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    static void main() {
        int[] arreglo = {7, 9, 5, 8, 6};

        int suma = sumarArray(arreglo);
        double promedio = promedioArray(arreglo);
        int max = maximoArray(arreglo);

        IO.println("La suma es: " + suma);
        IO.println("El promedio es: " + promedio);
        IO.println("El numero maximo es: " + max);
    }
}
