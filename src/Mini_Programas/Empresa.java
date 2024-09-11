package Mini_Programas;

public class Empresa  {
    private String nombre;
    private String apeliidoP;
    private String apellidoM;
    private String curp;
    private String ine;
    private int edad;
    private int nss;
    private char sexo;

    public Empresa(String nombre, String apeliidoP, String apellidoM, String curp, String ine, int edad, int nss, char sexo) {
        this.setNombre(nombre);
        this.setApeliidoP(apeliidoP);
        this.setApellidoM(apellidoM);
        this.setCurp(curp);
        this.setIne(ine);
        this.setEdad(edad);
        this.setNss(nss);
        this.setSexo(sexo);
    }

    private Empresa(){
        this("Sin nimbre", "Sin apellido Paterno", "Sin apellido Materno", "Sin Curp", "Sin ine", (int) 1, (int) 1, 'n');
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliidoP() {
        return apeliidoP;
    }

    public void setApeliidoP(String apeliidoP) {
        this.apeliidoP = apeliidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Empresa" +
                "\n Nombre:" + nombre +
                "\n Apellido Paterno:" + apeliidoP +
                "\n Apellido Materno:" + apellidoM +
                "\n Curp:" + curp +
                "\n Ine:" + ine +
                "\n Edad:" + edad +
                "\n Nss:" + nss +
                "\n Sexo:" + sexo ;
    }
}
