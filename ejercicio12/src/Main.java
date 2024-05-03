import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Escriba un programa que entre un número de cinco dígitos, separe el número
        // en sus dígitos individuales e imprima los dígitos separados unos de otros
        // mediante tres espacios. Por ejemplo, si el usuario escribe 42339 el programa
        // debería imprimir:
        //
        //4 2 3 3 9

        int numero,unidad,decena,centena,millar,decena_millar;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese un numero entero de 5 cifras para para separarlo por sus cifras");
        numero= ssc.nextInt();
        unidad=numero%10;
        decena=numero/10%10;
        centena=numero/100%10;
        millar=numero/1000%10;
        decena_millar=numero/10000%10;
        System.out.println("El numero por separado seria "+decena_millar+" "+millar+" "+centena+" "+decena+" "+unidad);

    }
}