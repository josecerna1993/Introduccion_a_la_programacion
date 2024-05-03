import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Leer los lados de un rectángulo,
        // calcular y mostrar por pantalla su superficie y perímetro.

        float base,altura,perimetro,superficie;
        Scanner ssc = new Scanner(System.in);

        System.out.println("Ingrese la base de un rectangulo: ");
        base = ssc.nextFloat();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = ssc.nextFloat();
        perimetro=2*(base+altura);
        superficie=base*altura;
        System.out.println("El perimetro del rectangulo es " +String.format("%.2f",perimetro));
        System.out.println("La superficie del rectangulo es " +String.format("%.2f",superficie));
    }
}