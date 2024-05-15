import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Desarrolle un programa que determine la nómina bruta para cada uno de varios empleados.
        // La empresa paga “tiempo normal” para las primeras 40 horas trabajadas
        //de cada empleado y paga “tiempo y medio” para todas las horas trabajadas en exceso de 40 horas.
        // Se le proporciona una lista de los empleados de la empresa, el número de horas que cada empleado
        // trabajó la última semana, y la tasa horaria de cada empleado. Su programa deberá introducir esta
        // información para cada uno de los empleados, y determinar y desplegar la nómina bruta de cada uno
        // de ellos. El proceso finalizará cuando se ingrese el número de horas trabajadas igual a –1.

        double horas,sueldo,precio_hora;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese el precio a pagar por hora para los empleados");
        precio_hora= ssc.nextDouble();
        System.out.println("Ingrese la cantidad de horas trabajadas:");
        horas= ssc.nextDouble();
        while (horas!=-1)
        {
            if (horas<=40)
            {
                sueldo=horas*precio_hora;
                System.out.println("La ganancia bruta del empleado es de "+String.format("%.2f",sueldo));
                System.out.println("Ingrese la cantidad de horas trabajadas:");
                horas= ssc.nextDouble();
            }
            else
            {
                if (horas>40)
                {
                    sueldo=horas*precio_hora*1.50;
                    System.out.println("La ganancia bruta del empleado es de "+String.format("%.2f",sueldo));
                    System.out.println("Ingrese la cantidad de horas trabajadas: ");
                    horas= ssc.nextDouble();
                }
            }
        }
        System.out.println("Se finalizo el programa");
    }
}
