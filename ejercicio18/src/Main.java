import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Escriba un programa que lea un entero y determine e imprima si es par o impar.

        int numero;
        Scanner ssc= new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        numero= ssc.nextInt();
        if (numero%2==0)
        {
            System.out.println("El numero ingresado es par");
        }
        else
        {
            System.out.println("El numero ingresado es impar");
        }

    }
}