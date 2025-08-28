package Run3;

public class Estudiante {
    private String nombre;
    private int matricula;
    private double promedio;
    public Estudiante(String nombre, int matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    public boolean estaAprobado() {
        return promedio >= 70;
    }
    public String getNombre() {
        return nombre;
    }
    public int getMatricula() {
        return matricula;
    }
    public double getPromedio() {
        return promedio;
    }
}
