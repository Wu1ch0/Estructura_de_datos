package Mini_paquete;
import java.util.Arrays;

public class Arreglo {

    private static int[] numeros = {1, 9, -8, 7};
    private static String[] nombres = {"Juan", "Peter", "María"};

    public void listarArreglo() {
        System.out.println("Listar Arreglo con foreach");

        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
    }

    public void listarArregloConForI() {
        System.out.println("\n\nListar Arreglo con for normal");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "");
        }
    }


    public void sumarElementosDeArreglo() {
        System.out.println("\n\nSumar los elementos de un arreglo");

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = numeros[i] + suma;
        }

        System.out.println("Suma de todos los elementos del arreglo: " + suma);
    }


    public void elementoMayor() {
        System.out.println("\n\nImprimir el elemento más grande del arreglo");

        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }


    public void elementoMenor() {
        System.out.println("\n\nImprimir el elemento más pequeño del arreglo");

        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número menor es: " + menor);
    }


    public void invertirArreglo() {
        System.out.println("\n\nInvertir elementos del arreglo");
        System.out.println("\nArreglo original: ");

        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }

        for (int i = 0; i < numeros.length / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - i - 1] = temporal;
        }

        System.out.println("\nArreglo invertido: ");

        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
    }

    public void promedio() {
        System.out.println("\n\nPromedio del arreglo");
       int suma = 0;
       for (int numero : numeros) {
           suma += numero;
       }

       // float promedio = suma / numeros.length;
       double promedio = Math.floor(suma / numeros.length);
       System.out.println("El promedio es: " + promedio);
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false; // Números menores o iguales a 1 no son primos
        for (int i = 2; i <= Math.sqrt(n); i++) { // Solo necesitamos comprobar hasta la raíz cuadrada de n
            if (n % i == 0) {
                return false; // Si n es divisible por i, no es primo
            }
        }
        return true; // Si no se encontraron divisores, entonces es primo
    }

    public void verificaPrimos(){
        for (int numero : numeros) {
            if (esPrimo(numero)){
                System.out.println(numero +"El primero es: ");
            }else {
                System.out.println("El segundo es: " + numero);
            }
        }
    }

    public void multiplos() {
        System.out.println("\n\nMultiplo del arreglo");
        int i;
        for(i=1; i <=numeros.length; i++){
            System.out.println(numeros[i]);

            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

    }

    public void siEsta(int estaElNum) {
        System.out.println("\n\n El elemento esta en el programa");
        int contador = 0;
        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == estaElNum)
                contador++;
            encontrado = true;
        }
        if (encontrado) {
            System.out.println("\n\n El numero si esta en tu Array, esta: " + contador + " veces");
        } else {
            System.out.println("\n\n el numero no esta en tu Array");
        }
    }

    public void contarNumeros(int numeroBuscado) {
        System.out.println("\n\n Contar los numeros dependiendo cual pidas");
        int contador = 0;
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                contador++;
            }
        }
        System.out.println("El numero " + numeroBuscado + " aparecio " + contador + " veces ");

    }
}
