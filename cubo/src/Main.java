import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //yo en este caso supomgo al cubo como hueco que solo importan las aristas
        // es decir cada cara es un plano y por lo cual podesmos escribirlo como
        //coordenadas cartesianas.

        String [] colores= new String[6];
        Scanner ssc= new Scanner(System.in);
        System.out.println("Ingrese los colores de las caras del cubo");
        for(int i=0;i<6;i++)
        {
            System.out.println("Ingrese el color de la cara "+(i+1));
            colores[i]= ssc.next();
        }
        for(int z=0;z<5;z++)
        {
            for(int j=0;j<5;j++)
            {
                for(int i=0;i<5;i++)
                {
                    if (j>0 && j<4 && i>0 && i<4)
                    {
                        switch (z) {
                            case 0:
                                System.out.println("El lado (" + i + "," + j + "," + z + ") es de color " + colores[0]);
                                break;
                            case 4:
                                System.out.println("El lado (" + i + "," + j + "," + z + ") es de color " + colores[1]);
                        }
                    }
                    else{
                        if (j>0 && j<4 && z>0 && z<4){
                            switch (i) {
                                case 0:
                                    System.out.println("El lado (" + i + "," + j + "," + z + ") es de color " + colores[2]);
                                    break;
                                case 4:
                                    System.out.println("El lado (" + i + "," + j + "," + z + ") es de color " + colores[3]);
                            }
                        }
                        else{
                            if (i>0 && i<4 && z>0 && z<4){
                                switch (j) {
                                    case 0:
                                        System.out.println("El lado (" + i + "," + j + "," + z + ") es de color " + colores[4]);
                                        break;
                                    case 4:
                                        System.out.println("El lado (" + i + "," + j + "," + z + ") es de color " + colores[5]);
                                }
                            }
                        }
                    }

                }

            }
        }
        

    }
}
