import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leer edades hasta ingresar una edad igual a 200. Mostrar la cantidad de
        // personas menores de edad, la cantidad entre 21 y 40 y los mayores de 40.

        int edad,menores=0,jovenes=0,mayores=0;
        Scanner ssc=new Scanner(System.in);
        do {
            System.out.println("Ingrese las edades: (para finalizar ingrese 200)");
            edad= ssc.nextInt();
            if (edad<18)
            {
                menores++;
            }
            else
            {
                if (edad>=18 && edad<=40){
                    jovenes++;
                }
                else
                {
                    if (edad>40 && edad!=200)
                        mayores++;
                }
            }
        }while (edad!=200);
        System.out.println("los menores de edad son "+menores+", los que estan entre 21 y 40 son "+jovenes+" y los mayores de 40 son"+mayores);
    }
}
