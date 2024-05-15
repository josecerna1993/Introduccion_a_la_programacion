import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Realizar un algoritmo que calcule las pagas semanales de los empleados
        // de una empresa, sabiendo que éstos se calculan en base a las horas semanales
        // trabajadas y de acuerdo a un precio especificado por cada hora. Si se pasan de
        // 40 horas semanales, las horas extraordinarias se pagarán a razón de 1,5 veces
        // la hora ordinaria. El programa debe permitir ingresar las horas por dias,

        int horasTotales=0,hora;
        float precioHora,precioPagar;
        
        Scanner ssc=new Scanner(System.in);

            for(int i= 1;i<=7;i++)
            {
                System.out.println("Ingrese las horas trabajadar el dia "+i);
                hora= ssc.nextInt();
                horasTotales+=hora;
            }
            System.out.println("Ingrese el valor de la hora de trabajo");
            precioHora= ssc.nextFloat();
            if (horasTotales>40)
            {
                precioPagar=precioHora*40 + 15*precioHora*(horasTotales-40)/10;
                System.out.println("El precio a pagar al empleado es de "+String.format("%.2f",precioPagar));
            }
            else
            {
                precioPagar=precioHora+horasTotales;
                System.out.println("El precio a pagar al empleado es de "+String.format("%.2f",precioPagar));
            }


    }
}
