import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*mensaje de bienvenida y reglas de juego*/
        String reglas_del_juego="El objetivo de cualquier mano de blackjack es derrotar a la " +
                "\n banca. Para esto, debes tener una mano que puntúe más alto que la mano de " +
                "\nla banca, pero que no supere los 21 puntos en valor total. O bien, puedes ganar" +
                "\n con una puntuación inferior a 22 cuando la mano de la banca supera los 21 puntos."+
                "\n Se te otorgaran 2 cartas puedes pedir las cartas que desees"+
                "\n Tener en cuenta que el As vale 1 o 11 puntos a decision del usuario;"+
                "\n El Jota, Reyna y Rey valen 10 puntos respectivamente"+
                "\n La Banca debera pedir cartas mientras su suma sea menor a 17";
        JOptionPane.showMessageDialog(null,
                new ImageIcon(Main.class.getResource("/imagenes/simbolo_black_jack.jpg")),
                "Bienvenidos al Black Jack",
                JOptionPane.DEFAULT_OPTION
                );
        JOptionPane.showMessageDialog(null,reglas_del_juego,"Reglas del juego",
                JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/imagenes/simbolo_black_jack.jpg"))
        );

        /*varibles*/

        String [] simbolo_carta=new String[]{"corazones.jpg","diamantes.jpg","flores.jpg","picas.jpg"};
        Scanner ssc=new Scanner(System.in);
        /*tome 20 espacios en los array ya que de la posicion (0-9) seran del usuario y de (9-19) sera de la banca*/
        int [] numero=new int[20]; /* se almacena los numeros (1-13) de las cartas*/
        int[] simbolo=new int[20]; /* se almacenan los numeros (1-4) que son para los simbolos de las cartas */
        int cartas_computador; /*almacenara la cantidad de cartar que elijio el computador*/
        int puntos_usuario;
        int puntos_computadora;
        String confirmacion_de_jugar="si";


        while (confirmacion_de_jugar.equals("si") || confirmacion_de_jugar.equals("s"))
        {
            int carta_extra=2;/*contador por si el usuario pide mas de 2 cartas*/
            for (int i=0;i<20;i++)
            {
                numero[i]=generadorNumeroAleatorio(); /*llamamos a las funciones para que en cada ronda dean numeros aleaorios distintod*/
                simbolo[i]=generadorSimboloAleatorio();
            }

            /*2 primeras cartas del usuario*/
            ImageIcon[] cartas_usuario=new ImageIcon[2];
            for (int i=0;i<=1;i++)
            {
                cartas_usuario[i]=new ImageIcon("src/imagenes/"+numero[i]+"_"+simbolo_carta[simbolo[i]]);
            }
            JPanel panel=new JPanel();
            panel.setLayout(new GridLayout(1,2));

            for (ImageIcon image:cartas_usuario)
            {
                JLabel label=new JLabel(image);
                panel.add(label);
            }

            JOptionPane.showMessageDialog(null, panel, "Tus cartas", JOptionPane.INFORMATION_MESSAGE);

            /*consulta si pide mas de 2 cartas*/
            String confirmacion = JOptionPane.showInputDialog(null,"Desea otra carta: (si/no)");
            switch (confirmacion)
            {
                case "s":
                case "si":
                    while(confirmacion.equals("si") || confirmacion.equals("s") || carta_extra==10)
                    {

                        ImageIcon[] cartas_nuevas=new ImageIcon[carta_extra+1];
                        for (int i=0;i<=carta_extra;i++)
                        {
                            cartas_nuevas[i]=new ImageIcon("src/imagenes/"+numero[i]+"_"+simbolo_carta[simbolo[i]]);
                        }
                        JPanel panel2=new JPanel();
                        panel2.setLayout(new GridLayout(1,2));

                        for (ImageIcon image:cartas_nuevas)
                        {
                            JLabel label=new JLabel(image);
                            panel2.add(label);
                        }

                        JOptionPane.showMessageDialog(null, panel2, "Tus cartas", JOptionPane.INFORMATION_MESSAGE);

                        confirmacion = JOptionPane.showInputDialog(null,"Desea otra carta: (y/n)");
                        carta_extra++;
                    }
                    for (int i=0;i<carta_extra;i++) /*si las cartas elejidas son rey o reyna o jota pasamos a su valor real de 10 puntos*/
                    {
                        switch (numero[i])
                        {
                            case 11:
                            case 12:
                            case 13:
                                numero[i] = 10;
                                break;
                        }
                    }
                    for(int i=0;i<carta_extra;i++) /*si en caso sale as consultamos al usuario el valor */
                    {
                        if (numero[i]==1)
                        {
                            numero[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Que valor le daras al As (1 o 11)"));
                        }
                    }

                    break;
                case "no":
                case "n":
                    for (int i=0;i<2;i++)
                    {
                        switch (numero[i])
                        {
                            case 11:
                            case 12:
                            case 13:
                                numero[i] = 10;
                                break;
                        }
                    }
                    for(int i=0;i<2;i++)
                    {
                        if (numero[i]==1)
                        {
                            numero[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Que valor le daras al As (1 o 11)"));
                        }
                    }
                    break;
            }
            puntos_usuario=sumar_puntos_usuario(numero,carta_extra);
            puntos_computadora=sumar_puntos_computadora(numero);
            cartas_computador=contador_cartas_computador(numero);

            /*mostramos por consola las caras de la banca*/
            JOptionPane.showMessageDialog(null,"Acontinuacion se mostraran las cartas del Crupier y los puntos totales");


            ImageIcon[] cartas_oponente=new ImageIcon[cartas_computador];

            for (int i=10;i<(cartas_computador+10);i++)
            {
                cartas_oponente[i-10]=new ImageIcon("src/imagenes/"+numero[i]+"_"+simbolo_carta[simbolo[i]]);
            }
            JPanel panel3=new JPanel();
            panel3.setLayout(new GridLayout(1,2));

            for (ImageIcon image:cartas_oponente)
            {
                JLabel label=new JLabel(image);
                panel3.add(label);
            }

            JOptionPane.showMessageDialog(null, panel3, "Cartas del Cupier", JOptionPane.INFORMATION_MESSAGE);

            /*mostramos por consola los datos en general*/

            String mensaje_usuario= "Los puntos usuario son "+puntos_usuario+"\n Los puntos del Crupier son: "+puntos_computadora;

            if (puntos_usuario > puntos_computadora && puntos_usuario<21)
            {
                JOptionPane.showMessageDialog(null,mensaje_usuario,
                        "Ganastes el Juego",
                        JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(Main.class.getResource("/imagenes/ganastes.jpg"))
                );
            }
            else
            {
                if (puntos_usuario==21)
                {
                    JOptionPane.showMessageDialog(null,mensaje_usuario,
                            "Black Jack",
                            JOptionPane.DEFAULT_OPTION,
                            new ImageIcon(Main.class.getResource("/imagenes/simbolo_black_jack.jpg"))
                    );
                }
                else {
                    if (puntos_computadora>21 && puntos_usuario<21)
                    {
                        JOptionPane.showMessageDialog(null,mensaje_usuario,
                                "Ganastes el Juego",
                                JOptionPane.DEFAULT_OPTION,
                                new ImageIcon(Main.class.getResource("/imagenes/ganastes.jpg"))
                        );
                    }
                    else {
                        JOptionPane.showMessageDialog(null,mensaje_usuario,
                                "Game Over",
                                JOptionPane.DEFAULT_OPTION,
                                new ImageIcon(Main.class.getResource("/imagenes/gameover.jpg"))
                        );
                    }

                }
            }

            confirmacion_de_jugar=JOptionPane.showInputDialog(null,"Deseas volver a jugar(si/no)");
        }

    }


    public static int generadorNumeroAleatorio(){
        int numero_carta;
        numero_carta=(int)(Math.random()*13)+1;
        return numero_carta;
    }
    public static int generadorSimboloAleatorio(){
        int simbolo_carta;
        simbolo_carta=(int)(Math.random()*3);
        return simbolo_carta;
    }
    public static int sumar_puntos_usuario(int [] cartas,int cantidad){
        int suma=0;
        for(int i=0;i<cantidad;i++)
        {
            suma=suma+cartas[i];
        }
        return suma;
    }
    public static int sumar_puntos_computadora(int []cartas){
        int suma=0;
        int contador_cartas=12;
        for (int i=10;i<20;i++)
        {
            switch (cartas[i])
            {
                case 11:
                case 12:
                case 13:
                    cartas[i] = 10;
                    break;
                case 1:
                    cartas[i]=11;
                    break;
            }
        }
        suma=cartas[10]+cartas[11];
        if (suma>21)
        {
            if (cartas[10]==11)
            {
                cartas[10]=1;
                suma=suma-10;
            }
            else
            if (cartas[11]==11)
            {
                cartas[11]=1;
                suma=suma-10;
            }
        }
        if (suma<17)
        {
            while (suma<17)
            {
                suma+=cartas[contador_cartas];
                contador_cartas++;
            }
        }

        return suma;
    }
    public static int contador_cartas_computador(int []cartas){
        int suma=0;
        int contador_cartas=12;
        int numero_de_cartas=2;
        for (int i=10;i<20;i++)
        {
            switch (cartas[i])
            {
                case 11:
                case 12:
                case 13:
                    cartas[i] = 10;
                    break;
                case 1:
                    cartas[i]=11;
                    break;
            }
        }
        suma=cartas[10]+cartas[11];
        if (suma>21)
        {
            if (cartas[10]==11)
            {
                cartas[10]=1;
                suma=suma-10;
            }
            else
            if (cartas[11]==11)
            {
                cartas[11]=1;
                suma=suma-10;
            }
        }
        if (suma<17)
        {
            while (suma<17)
            {
                suma+=cartas[contador_cartas];
                contador_cartas++;
                numero_de_cartas++;
            }
        }

        return numero_de_cartas;
    }
}
