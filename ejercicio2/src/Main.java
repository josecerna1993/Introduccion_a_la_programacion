import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Diseñar un algoritmo que calcule la suma y el promedio de dos numeros ingresados por teclado
        int numUno,numDos;
        float suma,promedio;
        Scanner ssc = new Scanner(System.in);

        System.out.println("Calculador de suma y promedio de dos numeros");
        System.out.println("ingrese el primero numero");
        numUno = ssc.nextInt();

        System.out.println("Ingrese el segundo numero");
        numDos =ssc.nextInt();

        suma = numUno+numDos;
        promedio = (numDos+numUno)/2;

        System.out.println("El valor de la suma es: "+suma);
        System.out.println("El valor del promedio es: "+promedio);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}