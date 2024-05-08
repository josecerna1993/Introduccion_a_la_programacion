import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Hacer un programa que calcule el importe que debe pagar un auto en un
        // estacionamiento teniendo como datos los minutos de estadía.
        // El valor hora es $2 y si los minutos pasan de 15 se incrementa en una hora el importe.

        int datoMinutos,minutos,horas,precioHora;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos en el estacionamiento");
        datoMinutos= ssc.nextInt();
        horas=datoMinutos/60;
        minutos=datoMinutos%60;
        if (minutos<=15)
        {
            precioHora=horas*2;
            System.out.println("El precio a pagar por "+horas+" hora y "+minutos+" minutos es: "+precioHora+" pesos");
        }
        else
        {
            precioHora=horas*2+2;
            System.out.println("El precio a pagar por "+horas+" hora y "+minutos+" minutos es: "+precioHora+" pesos");
        }
    }
}