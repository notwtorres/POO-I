package Run;

import Run2.CuentaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020);
        coche1.mostrarInfo();

        Libro libro1 = new Libro("Toyota", "Corolla", 2020);
        libro1.mostrarInfo();
    }

}