package Mini_Programas;

public class Empleado_Temporada extends Empresa {
    private String diaInicio;
    private String mesInicio;
    private String anioInicio;
    private String diaFin;
    private String mesFin;
    private String anioFin;

    public Empleado_Temporada(String nombre, String apeliidoP, String apellidoM, String curp, String ine, int edad, int nss, char sexo) {
        super(nombre, apeliidoP, apellidoM, curp, ine, edad, nss, sexo);
    }

    public Empleado_Temporada(String nombre, String apeliidoP, String apellidoM, String curp, String ine, int edad, int nss, char sexo, String diaInicio, String mesInicio, String anioInicio, String diaFin, String mesFin, String anioFin) {
        super(nombre, apeliidoP, apellidoM, curp, ine, edad, nss, sexo);
        this.setDiaInicio(diaInicio);
        this.setMesInicio(mesInicio);
        this.setAnioInicio(anioInicio);
        this.setDiaFin(diaFin);
        this.setMesFin(mesFin);
        this.setAnioFin(anioFin);
    }

    public Empleado_Temporada() {
        this("Sin nombre", "Sin apellido", "Sin apellido", "SIn curp", "Sin ine",(int) 0,(int) 0,(char) 'n',"Sin dia inicio","Sin mes inicio","Sin año inicio","Sin dia final","Sin mes final","Sin año final");
    }

    public String getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(String diaInicio) {
        this.diaInicio = diaInicio;
    }

    public String getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(String mesInicio) {
        this.mesInicio = mesInicio;
    }

    public String getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(String anioInicio) {
        this.anioInicio = anioInicio;
    }

    public String getDiaFin() {
        return diaFin;
    }

    public void setDiaFin(String diaFin) {
        this.diaFin = diaFin;
    }

    public String getMesFin() {
        return mesFin;
    }

    public void setMesFin(String mesFin) {
        this.mesFin = mesFin;
    }

    public String getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(String anioFin) {
        this.anioFin = anioFin;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Dia de inicio:" + getDiaInicio() +
                "\n Mes que inicio:" + getMesInicio() +
                "\n Año que inicio:" + getAnioInicio() +
                "\n Fecha que finalizo" + getDiaFin() +
                "\n Dia que finalizo:" + getDiaFin() +
                "\n Mes que finalizo:" + getMesFin() +
                "\n Año que finalizo:" + getAnioFin();
    }
}
