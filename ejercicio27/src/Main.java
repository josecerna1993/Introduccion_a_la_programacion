import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Una gran empresa química paga a su personal de ventas en base a comisiones.
        // El personal de ventas recibe $200 por semana más 9% de las ventas brutas de esa semana.
        // Por ejemplo, una persona de ventas que vende $5000 de productos químicos en una semana,
        // recibe $200 más 9% de $5000, o sea un total de $650. Desarrolle un programa que introduzca
        // las ventas brutas de cada vendedor correspondiente a la última semana, y calcule y despliegue
        // las ganancias de dicho vendedor. Procese las cifras vendedor por vendedor y finalice cuando se
        // ingrese la venta bruta igual a –1.

        double venta,pago;
        Scanner ssc=new Scanner(System.in);
        do {
            System.out.println("Ingrese las ventas brutas del vendedor: ");
            venta= ssc.nextDouble();
            pago= 200 + (9*venta)/100;
            if (venta!=-1) //esto es para evitar de que primero mande el dato y despues finalize
            {
                System.out.println("El pago del trabajador es de "+String.format("%.2f",pago));
            }

        }while (venta!=-1);
    }
}
