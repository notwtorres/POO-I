package Run3;
import Run2.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static List<Estudiante> estudiantes = new ArrayList<Estudiante>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        while(true){
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes aprobados");
            System.out.println("3. Salir");
            int opcion = input.nextInt();
            input.nextLine();
            switch(opcion) {
                case 1:
                    crearEstudiante();
                    break;
                case 2:
                    mostrarAprobados();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    public static void crearEstudiante(){
        System.out.println("Nombre del estudiante: ");
        String nombre = input.nextLine();
        System.out.println("Matrícula del estudiante: ");
        int matricula = input.nextInt();
        System.out.println("Promedio del estudiante: ");
        double promedio = input.nextDouble();
        input.nextLine();
        Estudiante estudiante = new Estudiante(nombre, matricula, promedio);
        estudiantes.add(estudiante);
    }
    public static void mostrarAprobados(){
        System.out.println("Estudiantes aprobados:");
        for(Estudiante estudiante : estudiantes){
            if(estudiante.estaAprobado()){
                System.out.println("Nombre: " + estudiante.getNombre() + ", Matrícula: " + estudiante.getMatricula() + ", Promedio: " + estudiante.getPromedio());
            }
        }
    }
}
