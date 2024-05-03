import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static float pi=3.1416F;
    public static void main(String[] args) {
        //Leer el radio de un círculo y calcular
        // e imprimir su superficie y longitud de la circunferencia.
        float radio,superficie,perimetro;
        Scanner ssc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = ssc.nextFloat();
        perimetro=2*pi*radio;
        superficie=pi*radio*radio;
        System.out.println("La superficie seria "+String.format("%.2f",superficie));
        System.out.println("El perimetro seria "+String.format("%.2f",perimetro));

    }
}