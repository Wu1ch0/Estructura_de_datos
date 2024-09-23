package Atajos.minipilas;

class PilaSecuencia {
    private int capacidad;
    private String[] arreglo;
    private int cima;

    public PilaSecuencia(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new String[capacidad];
        this.cima = -1;
    }

    public void push(String elemento) {
        if (estaLlena()) {
            System.out.println("Error: La pila está llena.");
        } else {
            cima++;
            arreglo[cima] = elemento;
            System.out.println("Cadena " + elemento + " apilada.");
        }
    }

    public String pop() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        } else {
            String elemento = arreglo[cima];
            cima--;
            return elemento;
        }
    }

    public String peek() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        } else {
            return arreglo[cima];
        }
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == capacidad - 1;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Contenido de la pila: ");
            for (int i = cima; i >= 0; i--) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }
}
