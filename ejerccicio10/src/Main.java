import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Definir un algoritmo necesario para intercambiar los valores de dos variables numéricas.

        int numero,unidad,decena;
        Scanner ssc= new Scanner(System.in);

        System.out.println("Ingrese un numero entero de dos cifras");
        numero= ssc.nextInt();
        unidad=numero%10;
        decena=numero/10;
        System.out.println("El numero invertido es "+unidad+decena);


    }
}