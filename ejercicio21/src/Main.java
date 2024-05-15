import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ingresar 20 números desde el teclado y
        // calcular e imprimir la cantidad de números positivos y negativos.

        int numero,contador=0,contador_positivos=0,contador_negativos=0;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese 20 numero enteros entre positivos y negativos");
        while (contador<20)
        {
            numero= ssc.nextInt();
            if (numero>0)
            {
                contador_positivos++;
            }
            else
                contador_negativos++;
            contador++;
        }
        System.out.println("La cantidad de numeros positivos es "+contador_positivos);
        System.out.println("La cantidad de numero negativso es "+contador_negativos);
    }
}
