package herencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona
{
    private String  carnet;
    private double promedioNotas;
    private int numeroMaterias;
    public Estudiante()
    { }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }
    public String getCarnet() {
        return carnet;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }
    public int getNumeroMaterias() {
        return numeroMaterias;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public Estudiante ingresarDatosEstudiante() {
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "",apellido="",carnet = "";
        int edad = 0;
        double peso = 0.0,acu=0.0;
        carnet = leerDatoTipoCadena("Ingrese el usuario del carnet: ");
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        
        int numeroMaterias = leerDatoTipoEntero("Ingrese el numero de materias del estudiante: ");
        double promedioNotas=calcularPromedio(numeroMaterias);
        
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.setPromedioNotas(promedioNotas);
        //Retornamos el objeto
        return (nuevoEstudiante);
    }
    
    public double leerNotasEstudiante(double numeroMaterias)
    {
        double notaMateria;
        double acu=0.0;
        for (int i=0;i<numeroMaterias;i++)
        {
            notaMateria=leerDatoTipoReal("ingrese la nota de la materia: ");
            acu+=notaMateria;
        }
        return (acu);
    }
    public double calcularPromedio(int numeroMaterias)
    {
        double promedio=0.0;
        double acumulador;
        acumulador=leerNotasEstudiante(numeroMaterias);
        promedio=acumulador/numeroMaterias;
        return(promedio);
    }
    public void imprimirReporteNotasEstudiante()
    {
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null,"Serie del carnet del estudiante: "+ carnet+
                "\nREPORTE DE NOTAS \nNumero de materias: "+ numeroMaterias+"\nPromedio notas: "+promedioNotas);
    }
}
