package Mini_Programas;

public class Empleado_Externo extends Empresa{
    private String horario;

    public Empleado_Externo(String nombre, String apeliidoP, String apellidoM, String curp, String ine, int edad, int nss, char sexo) {
        super(nombre, apeliidoP, apellidoM, curp, ine, edad, nss, sexo);
    }

    public Empleado_Externo(String nombre, String apeliidoP, String apellidoM, String curp, String ine, int edad, int nss, char sexo, String horario) {
        super(nombre, apeliidoP, apellidoM, curp, ine, edad, nss, sexo);
        this.horario = horario;
    }

    public Empleado_Externo(){
        this("Sin nimbre", "Sin apellido Paterno", "Sin apellido Materno", "Sin Curp", "Sin ine", (int) 1, (int) 1, 'n',"Sin horario");
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Nombre:" + getNombre() +
                "\n horario:" + getHorario();
    }
}
