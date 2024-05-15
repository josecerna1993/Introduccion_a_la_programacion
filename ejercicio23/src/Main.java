public class Main {
    public static void main(String[] args) {
        //Calcular e imprimir la suma de todos los números pares entre 2 y 100.

        int suma=0;

        for (int i=2;i<=100;i++)
        {
            if (i%2==0)
            {
                suma+=i;
            }
        }
        System.out.println("La cantidad de los primeros 100 pares sumados es "+suma);


    }
}
