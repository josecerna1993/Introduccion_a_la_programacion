import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Un palíndromo es un número o frase de texto que se lee igual al
        //derecho que al revés. Por ejemplo, los siguientes enteros de cinco
        // dígitos son palíndromos: 12321, 55555, 45554 y 11611. Escriba un
        // programa que lea un entero de 5 dígitos y determine si es un palíndromo.
        // (Sugerencia: utilice los operadores de división y de módulo para separar los
        // números en sus dígitos individuales).

        int numero,unidad,decena,millar,decena_millar;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingrese un numero de 5 digitos entero");
        numero= ssc.nextInt();
        unidad=numero%10;
        decena=numero/10%10;
        millar=numero/1000%10;
        decena_millar=numero/10000;
        if (unidad==decena_millar && decena==millar)
        {
            System.out.println("El numero ingresado es palindromo");
        }
        else
            System.out.println("El numero no es palindromo");
    }
}
