package Run2;
import java.util.Scanner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Titular de la cuenta: ");
        String titular = input.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = input.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(titular, saldo);
        menu(cuenta);
    }
    public static void menu(CuentaBancaria cuenta) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Seleccione una opción:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            int opcion = input.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Cantidad a depositar: ");
                    double cantidadDeposito = input.nextDouble();
                    cuenta.depositar(cantidadDeposito);
                    break;
                case 2:
                    System.out.println("Cantidad a retirar: ");
                    double cantidadRetiro = input.nextDouble();
                    cuenta.retirar(cantidadRetiro);
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema bancario.");
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
