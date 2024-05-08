import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ingresar dos números, calcular su suma si el promedio es menor que el segundo,
        // su diferencia si es mayor y su producto si son iguales.

        float numeroUno,numeroDos,suma,promedio,diferencia,producto;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");
        numeroUno= ssc.nextFloat();
        numeroDos= ssc.nextFloat();
        promedio=(numeroUno+numeroDos)/2;
        if (promedio<numeroDos)
        {
            suma=numeroUno+numeroDos;
            System.out.println("La suma es "+String.format("%.2f",suma));
        }
        else
        {
            if (promedio>numeroDos)
            {
                diferencia=numeroUno-numeroDos;
                System.out.println("La diferencia es "+String.format("%.2f",diferencia));
            }
            else
            {
                producto=numeroUno*numeroDos;
                System.out.println("El producto es "+String.format("%.2f",producto));
            }
        }
    }
}