import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Diseñar un algoritmo que calcule el área de un triángulo en función de las longitudes
        // de sus lados a, b, c:
        //
        //Area = √p(p-a)(p-b)(p-c) donde p=(a+b+c) / 2
        float lado_uno,lado_dos,lado_tres,p;
        double area,dentro_raiz;
        Scanner ssc = new Scanner(System.in);
        System.out.println("Ingrese los lados de un triangulo en cm: ");
        lado_uno= ssc.nextFloat();
        lado_dos= ssc.nextFloat();
        lado_tres= ssc.nextFloat();
        p=(lado_uno+lado_dos+lado_tres)/2;
        dentro_raiz=p*(p-lado_uno)*(p-lado_dos)*(p-lado_tres);
        area=Math.pow(dentro_raiz,0.5);
        System.out.println("El area del triangulo seria: "+String.format("%.2f",area)+"cm2");

    }
}