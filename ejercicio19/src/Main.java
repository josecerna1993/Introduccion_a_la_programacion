import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escriba un programa que entre tres enteros diferentes del teclado,
        //y a continuación imprima el promedio, el más pequeño y el más grande
        // de estos números.

        int numeroUno,numeroDos,numeroTres;
        float promedio;
        Scanner ssc=new Scanner(System.in);

        System.out.println("Ingresen tres numeroo esnteros:");
        numeroUno= ssc.nextInt();
        numeroDos= ssc.nextInt();
        numeroTres= ssc.nextByte();
        promedio=(numeroUno+numeroDos+numeroTres)/3;
        System.out.println("El promedio es: "+String.format("%.2f",promedio));
        if (numeroUno>=numeroDos && numeroUno>=numeroTres)
        {
            System.out.println("El numero mayor es "+numeroUno);
            if (numeroDos>=numeroTres)
            {
                System.out.println("El numero menor es "+numeroTres);
            }
            else
            {
                System.out.println("el numero menor es "+numeroDos);
            }
        }
        else
        {
            if (numeroDos>=numeroUno && numeroDos>=numeroTres)
            {
                System.out.println("El numero mayor es "+numeroDos);
                if (numeroUno<=numeroTres)
                {
                    System.out.println("El numero menor es "+numeroUno);
                }
                else
                {
                    System.out.println("El numero menor es "+numeroTres);
                }
            }
            else
            {
                if (numeroTres>=numeroUno && numeroTres>=numeroDos)
                {
                    System.out.println("El numero mayor es "+numeroTres);
                    if (numeroUno>=numeroDos)
                    {
                        System.out.println("El numero menor es "+numeroDos);
                    }
                    else
                    {
                        System.out.println("El numero menor es "+numeroUno);
                    }
                }

            }
        }
    }
}

