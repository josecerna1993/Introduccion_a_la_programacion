import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("la edad necesaria para ingresar al boliche es ser mayor de 18 años");
        System.out.println("decime tu edada");

        int edad;
        Scanner teclado = new Scanner(System.in);

        edad = teclado.nextInt(); // es para guardar los datos

        int dinero = 30000;
        if (edad>=18) {
            System.out.println("pasa por caja");
            System.out.println("la entrada sale 25 mil pesos");
            if (dinero>=25000){
                System.out.println("entrada abonada");
            }
            else {
                System.out.println("lamentablemente no podes ingresar");
            }
        }
        else {
            System.out.println("no podes pasar");
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}