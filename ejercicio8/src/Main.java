import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Diseñar un algoritmo que realice la siguiente conversión: una temperatura
        // dada en grados Celsius a grados Fahrenheit.
        //
        //F°= 9 / 5 * C° + 32
        float celcius,fahrenheit;
        Scanner ssc = new Scanner(System.in);

        System.out.println("Ingrese los grados la temperatura en grados celciul");
        celcius=ssc.nextFloat();
        fahrenheit=(9*celcius)/5 + 32;
        System.out.println("La temperatura en Fahrenheit seria de "+String.format("%.2f",fahrenheit)+"F");

    }
}