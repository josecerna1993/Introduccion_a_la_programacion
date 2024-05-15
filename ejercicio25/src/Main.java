import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Una empresa desea saber cuánto es el total de los sueldos de sus empleados.
        // Si el último sueldo viene cargado con 0(cero) ¿Cuánto es dicho total?

        int contador_empleados=1;
        float sueldoTotal=0,sueldo;
        Scanner ssc=new Scanner(System.in);

        do {
            System.out.println("Ingrese el sueldo del empleado numero "+contador_empleados);
            sueldo= ssc.nextFloat();
            sueldoTotal+=sueldo;
            contador_empleados++;
            System.out.println("Si desea finalizar carga de sueldos ingrese 0");
        }while(sueldo!=0);
        System.out.println("El sueldo total de "+(contador_empleados-1)+" es de "+sueldoTotal);
    }
}
