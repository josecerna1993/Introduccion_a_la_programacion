import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Hallar el mayor de dos números enteros incesados por
        // el teclado. En caso de ser iguales indicarlo con un mensaje por pantalla.

        int numeroUno,numeroDos;
        Scanner ssc= new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros para saber cual es mayor");
        numeroUno= ssc.nextInt();
        numeroDos= ssc.nextInt();
        if (numeroUno>numeroDos){
            System.out.println("El numero "+numeroUno+" es mayor que "+numeroDos);
        }
        else {
            if (numeroDos>numeroUno){
                System.out.println("El numero "+numeroDos+" es mayor que "+numeroUno);
            }
            else {
                System.out.println("Los numero son iguales");
            }
        }

    }
}