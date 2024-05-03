import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Escribir un algoritmo para calcular el área de un triángulo dada la base y la altura.
        float base,altura,area;
        Scanner ssc = new Scanner(System.in);
        System.out.println("Ingrese la base de un triangulo: ");
        base = ssc.nextFloat();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = ssc.nextFloat();
        area=base*altura;
        System.out.println("El area del triangulo es "+String.format("%.2f",area)+" cm");
    }
}