import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Realizar un programa para sumar dos números tales que,
        // si la suma es mayor que 10, se divide por 2 y si la suma es menor que 10,
        // se multiplica por 3. Listar en todos los casos el resultado logrado.

        float numeroUno,numeroDos,suma,operacion;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");
        numeroUno= ssc.nextFloat();
        numeroDos= ssc.nextFloat();
        suma=numeroUno+numeroDos;
        System.out.println("La suma es "+String.format("%.2f",suma));
        if (suma>10)
        {
            operacion=suma/2;
            System.out.println("La division de "+String.format("%.2f",suma)+" entre 2 es "+String.format("%.2f",operacion));
        }
        else
        {
            if (suma<10)
            {
                operacion=suma*3;
                System.out.println("La multiplica de "+String.format("%.2f",suma)+" por 3 es "+String.format("%.2f",operacion));
            }
        }

    }
}