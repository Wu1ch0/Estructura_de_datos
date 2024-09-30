package PilaStack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        operacionesDePila();
    }

    public static void operacionesDePila() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No. de libros a ingresar: ");
        int capacidad = scanner.nextInt();
        PilaStack pilaSecuencia = new PilaStack(capacidad);

        int opcion;
        do {
            System.out.println("\nOperaciones:");
            System.out.println("1. Agregar libro (push)");
            System.out.println("2. Eliminar ultimo libro agregado (pop)");
            System.out.println("3. Mostrar el ultimo libro agregado (peek)");
            System.out.println("4. Mostrar Todos los libros agregados");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del libro: ");
                    String elemento = scanner.next();
                    pilaSecuencia.push(elemento);
                    break;
                case 2:
                    String cadenaDesapilada = pilaSecuencia.pop();
                    if (cadenaDesapilada != null) {
                        System.out.println("Eliminar ultimo libro registrado: " + cadenaDesapilada);
                    }
                    break;
                case 3:
                    String cima = pilaSecuencia.peek();
                    if (cima != null) {
                        System.out.println("Ultimo registrado: " + cima);
                    }
                    break;
                case 4:
                    pilaSecuencia.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
