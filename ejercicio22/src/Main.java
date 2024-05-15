import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calcular e imprimir la suma de los N primeros números enteros.

        int numero,suma=0,contador=0;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de los primeros numeros enteros a sumar ");
        numero= ssc.nextByte();
        while (contador<=numero)
        {
            suma+=contador;
            contador++;
        }
        System.out.println("La suma de los "+numero+" primeros numero es "+suma);
    }
}
