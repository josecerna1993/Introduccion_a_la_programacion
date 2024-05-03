import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Determinar la hipotenusa de un triángulo rectángulo conocidas
        // las longitudes de los catetos.
        float cateto_uno,cateto_dos;
        double calculo_inical,hipotenusa;
        Scanner ssc = new Scanner(System.in);

        System.out.println("Ingrese a continuacion los 2 catetos del triangulo: ");
        cateto_uno= ssc.nextFloat();
        cateto_dos= ssc.nextFloat();
        calculo_inical=Math.pow(cateto_uno,2)+Math.pow(cateto_dos,2);
        hipotenusa= Math.pow(calculo_inical,0.5);
        System.out.println("La hipotenusa es "+String.format("%.2f",hipotenusa)+"cm");

    }
}