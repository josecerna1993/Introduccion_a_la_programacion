import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Se debe obtener el salario neto de un trabajador conociendo el número de horas
        // trabajadas, el valor de la hora y la tasa de impuestos que se debe deducir.
        int numero_hora;
        float precio_hora,impuesto,total,subtotal;
        Scanner ssc = new Scanner(System.in);

        System.out.println("Para saber el salario neto complete los siguientes datos");
        System.out.println("Ingrese numero de horas trabajadas: ");
        numero_hora = ssc.nextInt();
        System.out.println("Ingrese el precio por hora");
        precio_hora = ssc.nextFloat();
        System.out.println("Ingrese el porcentaje de impuestos");
        impuesto = ssc.nextFloat();
        subtotal = numero_hora*precio_hora;
        total= impuesto*subtotal/100 + subtotal;
        System.out.println("El precio total a cobrar es de " +String.format("%.2f",total));
    }
}