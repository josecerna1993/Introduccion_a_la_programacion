import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dados tres números determinar si la suma de cualquier pareja
        // de ellos es igual al tercer número, y escribir “Iguales”,
        // y en caso contrario escribir “Distintos”.

        int numero_uno,numero_dos,numero_tres;
        Scanner ssc= new Scanner(System.in);

        System.out.println("Acontinuacion ingrese 3 numeros enteros: ");
        numero_uno= ssc.nextInt();
        numero_dos= ssc.nextInt();
        numero_tres= ssc.nextInt();
        if((numero_uno+numero_dos)==numero_tres || (numero_uno+numero_tres)==numero_dos || (numero_dos+numero_tres)==numero_uno)
        {
            System.out.println("iguales");
        }
        else{
            System.out.println("Distintos");
        }
    }
}