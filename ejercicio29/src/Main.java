import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dado un conjunto de sueldos a pagar (sin centavos), finalizado con un sueldo cero,
        // desarrollar el programa que determine e imprima cuántos billetes de $100, $50, $20,
        // $10, $5 y $2 son necesarios para ensobrar cada uno de los sueldos y no tener dificultades
        // con el cambio. Considere las monedas de $1.

        int sueldo,sueldo_total=0,b_cien,b_cincuenta,b_veinte,b_diez,b_cinco,b_dos,b_uno;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese el sueldo en numeros enteros");
        sueldo= ssc.nextInt();
        while (sueldo!=0)
        {
            sueldo_total+=sueldo;
            System.out.println("Ingrese el sueldo en numeros enteros");
            sueldo= ssc.nextInt();
        }
        b_cien=sueldo_total/100;
        b_cincuenta=sueldo_total%100/50;
        b_veinte=sueldo_total%100%50/20;
        b_diez=sueldo_total%100%50%20/10;
        b_cinco=sueldo_total%100%50%20%10/5;
        b_dos=sueldo_total%100%50%20%10%5/2;
        b_uno=sueldo_total%100%50%20%10%5%2;

        System.out.println("La cantidad a pagar es de "+sueldo_total);
        System.out.println("La cantidad de billetes de 100 son "+b_cien);
        System.out.println("La cantidad de billetes de 50 es de "+b_cincuenta);
        System.out.println("La cantidad de billetes de 20 es de "+b_veinte);
        System.out.println("La cantidad de billetes de 10 es de "+b_diez);
        System.out.println("La cantidad de billetes de 5 es de "+b_cinco);
        System.out.println("La cantidad de billetes de 2 es de "+b_dos);
        System.out.println("La cantidad de billetes de 1 es de "+b_uno);
    }
}
