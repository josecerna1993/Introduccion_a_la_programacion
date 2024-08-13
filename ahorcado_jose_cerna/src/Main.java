import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String[] palabras={"abeja","arbol","anillo","avion","aro"
        ,"azul","ardilla","abanico","amarillo","elote","elefante"
        ,"empanada","espejo","escalera","erizo","estrella","espada"
        ,"enano","escoba","indio","isla","iguana","iglesia"
        ,"insecto","invierno","incendio","impresora","oveja"
        ,"ojo","oso","oreja","ovni","unicornio","universo","urna"};

        String[] caracteristicas={
                "Insecto fabricador de miel","Tienen hojas, dan oxigeno","Presente en todo casamiento",
                "Propio de un aeropuerto","Pieza de la rueda de la bicicleta","Uno de los colores","Amante de las nueces",
                "Utencilio manual usado por las mujeres en la edad media","Uno de los colores","Sinonimo de Maiz",
                "Uno de los mamiferos mas grandes del mundo","Típico de la cocina, pueden ser de carne, pollo, etc.",
                "Nos refleja","Lo usamos para subir y bajar pisos","Mamifero con pelos de puntas","Se ven en el cielo solo de noche.",
                "Accesorio del soldado de la Edad Media.","Sinónimo de pequeño","Utencilio de limpieza en los hogares",
                "Gentilicio de la India","Archipielago del mar","Mamifero que cambia de color","Espacio del encuentro religiosso",
                "Pertenece al reino artrópodos","Estación del año","Fuego no controlado","Dispositivo que plasma textos o graficos en papel",
                "Produce lana","Órgano de la vista","Mamifero tipico del bosque.","Sirve para oir",
                "Sinónimo de platillo volador","Criatura mitologica con un cuerno en la cabeza","Totalidad de todas las cosas",
                "Caja para depositar sobres y/o papeles"
        };

        String reglas_juego="El juego del ahorcado consiste en completar la palabra escondida" +
                "\n ,tenes 5 intentos antes que se arme la figura del ahorcado."+
                "\n Deberas ir ingresando en cada turno una letra, si es acertada "+
                "\n se ira llenando en los respectivos casilleros, caso contrario "+
                "\n se ira formando la figura del ahorcado."+
                "\n Como ayuda tendras una breve descripcion de la palabra.";

        JOptionPane.showMessageDialog(null,
                new ImageIcon(Main.class.getResource("imagenes/ahorcado.png")),
                "Bienvenido al Juego del Ahorcado",
                JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null,reglas_juego,
                        "Reglas del Juego",
                JOptionPane.DEFAULT_OPTION,
                new ImageIcon(Main.class.getResource("imagenes/ahorcado.png"))
                );

        Scanner ssc= new Scanner(System.in);
        String confirmacion_de_jugar="y";
        while (confirmacion_de_jugar.equals("y") || confirmacion_de_jugar.equals("yes"))
        {
            int posicion_palabra=selector_palabra(); /*obtengo que palabra usare y descricpcion*/
            int cantidad_letras=palabras[posicion_palabra].length(); /* obtengo la cantidad de letras*/
            char []letras=new char[cantidad_letras]; /* hago 2 array uno que guardara las letras y el otro los espacios vacios*/
            char []espacios_vacios=new char[cantidad_letras];
            int intentos_fallidos=0;
            int intentos_afirmativos=0;

            for (int i=0;i<cantidad_letras;i++)
            {
                letras[i]=palabras[posicion_palabra].charAt(i);
                espacios_vacios[i]='—';
            }
            for (int i=0;i<cantidad_letras;i++){
                System.out.println("ff"+letras[i]);
            }

            do {
                String mensaje = "Palabra: \n"+ Arrays.toString(espacios_vacios);

                String ingresado=(String)JOptionPane.showInputDialog(null,mensaje,"Descripción: "+caracteristicas[posicion_palabra],
                        JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon(Main.class.getResource("imagenes/ahorcado_"+(intentos_fallidos+1)+".jpg")),null,""
                );
                char letra_ingresada=ingresado.charAt(0);
                int aciertos=0;

                for (int i=0;i<cantidad_letras;i++)
                {

                    if(letra_ingresada == letras[i])
                    {
                        espacios_vacios[i]=letra_ingresada;
                        aciertos++;
                    }

                }
                if (aciertos==0){
                    intentos_fallidos++;
                }
                else
                {
                    intentos_afirmativos=intentos_afirmativos+aciertos;
                }

            }while (intentos_fallidos!=6 && intentos_afirmativos!=cantidad_letras);

            if (intentos_fallidos==6)
            {
                JOptionPane.showMessageDialog(null,"Buena suerte para la proxima",
                        "Gameover",
                        JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(Main.class.getResource("imagenes/ahorcado_7.jpg")));
            }
            if(intentos_afirmativos==cantidad_letras)
            {
                JOptionPane.showMessageDialog(null,"GANASTES",
                        "WINS",
                        JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(Main.class.getResource("imagenes/ganastes.jpg")));
            }

            confirmacion_de_jugar=JOptionPane.showInputDialog(null,"Desea volver a jugar: y/n");

        }

    }

    public static int selector_palabra(){
        int posicion;
        posicion=(int) (Math.random()*34);
        return posicion;
    }
    }
