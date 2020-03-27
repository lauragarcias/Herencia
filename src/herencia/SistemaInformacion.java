
package herencia;

import javax.swing.JOptionPane;

public class SistemaInformacion 
{
    public SistemaInformacion() {
    }
    public static void main(String[] args) {
        int opcion = 0;
        Persona sistemaInformacion = new Persona();
        try {//Usamos la herencia de la superclase para acceder a los
             //mÃ©todos de lectura de datos 
            do { 
                opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese 1 para procesar los datos del empleado, 2 para los datos del estudiante y 3 para salir: ");
                 if (opcion==1){
                        JOptionPane.showMessageDialog(null, "Procesando datos del empleado");
                        Empleado manejadorEmpleado = new Empleado();//Leemos los datos
                        manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();//Mostramos el reporte de datos
                        manejadorEmpleado.imprimirReporteEstadoEmpleado();
                    }else if(opcion==2){
                        JOptionPane.showMessageDialog(null, "Procesando datos del estudiante");
                        Estudiante estudiante=new Estudiante();
                        estudiante=estudiante.ingresarDatosEstudiante();
                        estudiante.imprimirReporteNotasEstudiante();
                    }
                    else if(opcion==3){
                        JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                        break;
                    } else  JOptionPane.showMessageDialog(null, "OpciÃ³n invÃ¡lida");
            } while (opcion <= 1 || opcion >= 3);//fin del do-while
        }//Fin del try
        catch (Exception errorMain) {
            JOptionPane.showMessageDialog(null, "Error en la digitaciÃ³n: ");
            errorMain.printStackTrace();
        }
}
}


