package Mini_paquete;

public class App {
    public static void main(String[] args) throws Exception {
        operacionesDeArreglos();
    }

    public static void operacionesDeArreglos() {
        Arreglo arreglo = new Arreglo();
        arreglo.listarArreglo();
        arreglo.listarArregloConForI();
        arreglo.sumarElementosDeArreglo();
        arreglo.elementoMayor();
        arreglo.elementoMenor();
        arreglo.invertirArreglo();
        arreglo.promedio();
        arreglo.verificaPrimos();
        arreglo.multiplos();
        arreglo.siEsta(0);
        arreglo.contarNumeros(0);
    }
}
