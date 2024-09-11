package Mini_Programas;

public class Empleado_Base extends Empresa{

    private byte antiguedad;

    public Empleado_Base(String nombre, String apeliidoP, String apellidoM, String curp, String ine, int edad, int nss, char sexo) {
        super(nombre, apeliidoP, apellidoM, curp, ine, edad, nss, sexo);
    }

    public Empleado_Base() {
        this("Sin nombre", "Sin apellido", "Sin apellido", "SIn curp", "Sin ine", (int) 0,(int) 0,'n');
    }

    public byte getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(byte antiguedad) {
        this.antiguedad = antiguedad;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n Antiguedad: " + antiguedad ;
    }
}
