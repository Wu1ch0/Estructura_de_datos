package Mini_Programas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa;
        byte opc;
        opc = Byte.parseByte(JOptionPane.showInputDialog("1- Empleado Base" +
                "\n 2- Empleado de Temporada" +
                "\n 3- Empleado Externo"));
        switch (opc){
            case 1:
                empresa = new Empleado_Base();
                desplegarEmpleado(empresa);
                ((Empleado_Base)empresa).setAntiguedad(Byte.parseByte(JOptionPane.showInputDialog("Antiguedad Base:")));
                desplegarEmpresa(empresa);
                break;
                case 2:
                    empresa = new Empleado_Temporada();
                    desplegarEmpleado(empresa);
                    pedirTemporada(empresa);
                    desplegarEmpresa(empresa);
                    break;
                    case 3:
                        empresa = new Empleado_Externo();
                        desplegarEmpleado(empresa);
                        ((Empleado_Externo)empresa).setHorario(JOptionPane.showInputDialog("Hora:"));
                        desplegarEmpresa(empresa);
                        break;

        }
    }
    public static void pedirTemporada(Empresa empresa){
        ((Empleado_Temporada)empresa).setDiaInicio(JOptionPane.showInputDialog("Dia Inicio:"));
        ((Empleado_Temporada)empresa).setMesInicio(JOptionPane.showInputDialog("Mes inicio:"));
        ((Empleado_Temporada)empresa).setAnioInicio(JOptionPane.showInputDialog("Año inicio:"));
        ((Empleado_Temporada)empresa).setDiaFin(JOptionPane.showInputDialog("Dia Final:"));
        ((Empleado_Temporada)empresa).setMesFin(JOptionPane.showInputDialog("Mes final:"));
        ((Empleado_Temporada)empresa).setAnioFin(JOptionPane.showInputDialog("AÑo Final:"));
    }

    private static void desplegarEmpleado(Empresa e) {
        e.setNombre(JOptionPane.showInputDialog(null,"Nombre:"));
        e.setApeliidoP(JOptionPane.showInputDialog(null,"Apellido Paterno:"));
        e.setApellidoM(JOptionPane.showInputDialog(null,"Apellido Materno:"));
        e.setCurp(JOptionPane.showInputDialog(null,"Curp:"));
        e.setIne(JOptionPane.showInputDialog(null,"Ine:"));
        e.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,"Edad:")));
        e.setNss(Integer.parseInt(JOptionPane.showInputDialog(null,"Nss:")));
        e.setSexo(JOptionPane.showInputDialog(null,"Sexo:").charAt(0));

    }

    public static void desplegarEmpresa(Empresa e) {JOptionPane.showMessageDialog(null,e.toString());}
}
