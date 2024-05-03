import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Pasar un período expresado en segundos a un período
        // expresado en días, horas, minutos y segundos.

        int segundos,minutos,horas,segundos_resto;
        Scanner ssc= new Scanner(System.in);

        System.out.println("Ingrese los segundos para expresar en horas, minutos y segundos");
        segundos=ssc.nextInt();
        horas=segundos/3600;
        minutos=segundos%3600/60;
        segundos_resto=segundos%3600%60;

        System.out.println("Los segundos ingresados seria "+horas+" horas "+minutos+"minutos "+segundos_resto+" segudnos");


    }
}