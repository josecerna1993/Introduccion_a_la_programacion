import javax.swing.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String [][] datos_usuario=new String[24][6];

        datos_usuario[0][0]="rocio";datos_usuario[0][1]="negro";datos_usuario[0][2]="blanca";datos_usuario[0][3]="no lentes";datos_usuario[0][4]="mujer";datos_usuario[0][5]="no";
        datos_usuario[1][0]="hector";datos_usuario[1][1]="negro";datos_usuario[1][2]="blanca";datos_usuario[1][3]="no lentes";datos_usuario[1][4]="hombre";datos_usuario[1][5]="no";
        datos_usuario[2][0]="lucia";datos_usuario[2][1]="marron";datos_usuario[2][2]="blanca";datos_usuario[2][3]="no lentes";datos_usuario[2][4]="mujer";datos_usuario[2][5]="pendiente";
        datos_usuario[3][0]="cristina";datos_usuario[3][1]="negro";datos_usuario[3][2]="negra";datos_usuario[3][3]="no lentes";datos_usuario[3][4]="mujer";datos_usuario[3][5]="pendiente";
        datos_usuario[4][0]="juan";datos_usuario[4][1]="negro";datos_usuario[4][2]="blanca";datos_usuario[4][3]="no lentes";datos_usuario[4][4]="hombre";datos_usuario[4][5]="bigote";
        datos_usuario[5][0]="luis";datos_usuario[5][1]="negro";datos_usuario[5][2]="negra";datos_usuario[5][3]="no lentes";datos_usuario[5][4]="hombre";datos_usuario[5][5]="barba";
        datos_usuario[6][0]="elisa";datos_usuario[6][1]="negro";datos_usuario[6][2]="negra";datos_usuario[6][3]="lentes";datos_usuario[6][4]="mujer";datos_usuario[6][5]="no";
        datos_usuario[7][0]="carlos";datos_usuario[7][1]="negro";datos_usuario[7][2]="blanca";datos_usuario[7][3]="no lentes";datos_usuario[7][4]="hombre";datos_usuario[7][5]="barba";
        datos_usuario[8][0]="carmen";datos_usuario[8][1]="pelirrojo";datos_usuario[8][2]="blanca";datos_usuario[8][3]="no lentes";datos_usuario[8][4]="mujer";datos_usuario[8][5]="no";
        datos_usuario[9][0]="ivan";datos_usuario[9][1]="rubio";datos_usuario[9][2]="blanca";datos_usuario[9][3]="lentes";datos_usuario[9][4]="hombre";datos_usuario[9][5]="no";
        datos_usuario[10][0]="irene";datos_usuario[10][1]="negro";datos_usuario[10][2]="negra";datos_usuario[10][3]="no lentes";datos_usuario[10][4]="mujer";datos_usuario[10][5]="pendiente";
        datos_usuario[11][0]="jorge";datos_usuario[11][1]="marron";datos_usuario[11][2]="blanca";datos_usuario[11][3]="no lentes";datos_usuario[11][4]="hombre";datos_usuario[11][5]="barba";
        datos_usuario[12][0]="pablo";datos_usuario[12][1]="negro";datos_usuario[12][2]="blanca";datos_usuario[12][3]="lentes";datos_usuario[12][4]="hombre";datos_usuario[12][5]="no";
        datos_usuario[13][0]="antonio";datos_usuario[13][1]="negro";datos_usuario[13][2]="negra";datos_usuario[13][3]="no lentes";datos_usuario[13][4]="hombre";datos_usuario[13][5]="bigote";
        datos_usuario[14][0]="elena";datos_usuario[14][1]="pelirrojo";datos_usuario[14][2]="blanca";datos_usuario[14][3]="lentes";datos_usuario[14][4]="mujer";datos_usuario[14][5]="no";
        datos_usuario[15][0]="lucas";datos_usuario[15][1]="pelirrojo";datos_usuario[15][2]="blanca";datos_usuario[15][3]="lentes";datos_usuario[15][4]="hombre";datos_usuario[15][5]="no";
        datos_usuario[16][0]="marina";datos_usuario[16][1]="marron";datos_usuario[16][2]="blanca";datos_usuario[16][3]="lentes";datos_usuario[16][4]="mujer";datos_usuario[16][5]="no";
        datos_usuario[17][0]="alba";datos_usuario[17][1]="rubio";datos_usuario[17][2]="blanca";datos_usuario[17][3]="no lentes";datos_usuario[17][4]="mujer";datos_usuario[17][5]="no";
        datos_usuario[18][0]="daniel";datos_usuario[18][1]="negro";datos_usuario[18][2]="negra";datos_usuario[18][3]="no lentes";datos_usuario[18][4]="hombre";datos_usuario[18][5]="bigote";
        datos_usuario[19][0]="julia";datos_usuario[19][1]="rubio";datos_usuario[19][2]="blanca";datos_usuario[19][3]="lentes";datos_usuario[19][4]="mujer";datos_usuario[19][5]="no";
        datos_usuario[20][0]="miguel";datos_usuario[20][1]="rubio";datos_usuario[20][2]="blanca";datos_usuario[20][3]="no lentes";datos_usuario[20][4]="hombre";datos_usuario[20][5]="barba";
        datos_usuario[21][0]="oscar";datos_usuario[21][1]="pelirrojo";datos_usuario[21][2]="blanca";datos_usuario[21][3]="no lentes";datos_usuario[21][4]="hombre";datos_usuario[21][5]="no";
        datos_usuario[22][0]="beatriz";datos_usuario[22][1]="pelirrojo";datos_usuario[22][2]="blanca";datos_usuario[22][3]="no lentes";datos_usuario[22][4]="mujer";datos_usuario[22][5]="no";
        datos_usuario[23][0]="clara";datos_usuario[23][1]="marron";datos_usuario[23][2]="blanca";datos_usuario[23][3]="no lentes";datos_usuario[23][4]="mujer";datos_usuario[23][5]="no";
        String [][] datos_computadora=new String[24][6];
        for (int i=0;i<24;i++)
        {
            for (int j=0;j<6;j++)
            {
                datos_computadora[i][j]=datos_usuario[i][j];
            }
        }

       String []preguntas={"¿El color de cabello es negro?","¿El color de cabello es rubio?",
                "¿El color de cabello es marron?","¿El color de cabello es pelirrojo?",
                "¿El color de piel es negra?","¿El color de piel es blanca?","¿Usa lentes?",
                "Es hombre?","¿Es mujer?","¿Tiene barba?","¿Tiene bigote?","¿Tiene pendientes"};
       String reglas_juego="Se elige al azar un personaje para cada jugador\n"+
               "El objetivo es poder adivinar el personaje del oponente haciendo\n" +
               "diferentes preguntas cerradas.\n" +
               "En base a la respuesta podras ir descartando personajes\n" +
               "El que adivina el personaje primero gana, asi como el que erra pierde\n" +
               "automaticamente la partida.\n" +
               "A JUGAR!";

       int aleatorio_usuario=aleatorio_personaje();
       int aleatorio_computador=aleatorio_personaje();
       String []usuario=new String[6];
       String []computador=new String[6];
       String []aciertos_usuario=new String[6];/*array vacio para usuario*/
       String []aciertos_computador=new String[6];/*array vacio para computador*/
        int []preguntas_ya_realizadas=new int[12];/*array vacio en donde guardaremos las preguntas de la computadora*/
       int confirmar;
       int ronda=0; /*cantidad de rondas de preguntas*/

       /*elegimos los personajes de cada jugador*/

       for (int i=0;i<6;i++)
       {
           usuario[i]=datos_usuario[aleatorio_usuario][i];/*persona del usuario*/
           computador[i]=datos_usuario[aleatorio_computador][i];/*persona del computador*/
       }


       JOptionPane.showMessageDialog(null, new ImageIcon(Main.class.getResource("imagenes/logo.jpg")),
               "BIENVENIDO",
               JOptionPane.DEFAULT_OPTION
              );
       JOptionPane.showMessageDialog(null,reglas_juego,"REGLAS DEL JUEGO",
               JOptionPane.DEFAULT_OPTION);

       JOptionPane.showMessageDialog(null,new ImageIcon(Main.class.getResource("imagenes/plantilla.png")),
               "PLANTILLA DE PERSONAJES",JOptionPane.DEFAULT_OPTION);

       JOptionPane.showMessageDialog(null,new ImageIcon(Main.class.getResource("imagenes/"+usuario[0]+".jpg")),
               "Personaje Asignado",JOptionPane.DEFAULT_OPTION);



        String intento="no";  /*para preguntar al usuario si desea volver a preguntar o no*/
        String intento_computadora="";
        String personaje_usuario="vacio";








       while(Objects.equals(intento, "no") && personaje_usuario.equals("vacio")){
           /*pregunta usuario*/

           String lista="1.-¿El color de cabello es negro?" +
                   "\n2.-¿El color de cabello es rubio?" +
                   "\n3.-¿El color de cabello es marron?" +
                   "\n4.-¿El color de cabello es pelirrojo?" +
                   "\n5.-¿El color de piel es negra?" +
                   "\n6.-¿El color de piel es blanca?" +
                   "\n7.-¿Usa lentes?" +
                   "\n8.-¿Es hombre?" +
                   "\n9.-¿Es mujer?" +
                   "\n10.-¿Tiene barba?" +
                   "\n11.-¿Tiene bigote?" +
                   "\n12.-¿Tiene pendientes";

           int pregunta;
           String dato= (String)JOptionPane.showInputDialog(null,lista,"Elige la pregunta a realizar",
                   JOptionPane.PLAIN_MESSAGE,
                   new ImageIcon(Main.class.getResource("imagenes/interrogacion.jpg")),null,""
                   );
           pregunta=Integer.parseInt(dato);/*guardamos el numero en pregunta*/
           confirmar=validar(computador,pregunta);/*la funcion nos devuelve un 1 o 0 si es 1 es verdadeero*/
           /*en base a lo que devuelve la funcion analizamos las opciones*/
           if (confirmar==1)
           {
               switch (pregunta)
               {
                   case 1: aciertos_usuario[1]="negro";
                           for(int i=0;i<24;i++)
                           {
                               if (datos_usuario[i][1]!="negro")
                               {
                                   datos_usuario[i][0]="eliminado";
                               }
                           }
                   break;
                   case 2: aciertos_usuario[1]="rubio";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][1]!="rubio")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 3: aciertos_usuario[1]="marron";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][1]!="marron")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 4: aciertos_usuario[1]="pelirroja";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][1]!="negro")
                           {
                               datos_usuario[i][0]="pelirroja";
                           }
                       }
                   break;
                   case 5: aciertos_usuario[2]="negra";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][2]!="negra")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 6:aciertos_usuario[2]="blanca";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][2]!="blanca")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 7:aciertos_usuario[3]="lentes";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][3]!="lentes")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 8:aciertos_usuario[4]="hombre";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][4]!="hombre")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 9:aciertos_usuario[4]="mujer";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][4]!="mujer")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 10:aciertos_usuario[5]="barba";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][5]!="barba")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 11:aciertos_usuario[5]="bigote";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][5]!="bigote")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
                   case 12:aciertos_usuario[5]="pendiente";
                       for(int i=0;i<24;i++)
                       {
                           if (datos_usuario[i][5]!="pendiente")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       }
                   break;
               }
           }
           else {
               switch (pregunta)
               {
                   case 1:
                       for(int i=0;i<24;i++)
                        if (datos_usuario[i][1]=="negro")
                        {
                           datos_usuario[i][0]="eliminado";
                        }
                       break;
                   case 2:
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][1]=="rubio")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 3:
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][1]=="marron")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 4:
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][1]=="pelirrojo")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 5:aciertos_usuario[2]="blanca";
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][2]=="negra")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 6:aciertos_usuario[2]="negra";
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][2]=="blanca")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 7:aciertos_usuario[3]="no lentes";
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][3]=="lentes")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 8:aciertos_usuario[4]="mujer";
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][4]=="hombre")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 9:aciertos_usuario[4]="hombre";
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][4]=="mujer")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 10:
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][5]=="barba")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 11:
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][5]=="bigote")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
                   case 12:
                       for(int i=0;i<24;i++)
                           if (datos_usuario[i][5]=="pendientes")
                           {
                               datos_usuario[i][0]="eliminado";
                           }
                       break;
               }
           }





           /*pregunta computadora*/
           int numero_pregunta=0;
           int contador=0;
           while (contador!=1) /*nos aseguramos que se guarde en el array y que no se repitan las preguntas del computador*/
           {
                   int fallidos=0;
                   int aleatorio_pregunta=aleatorio();
                   for (int i=0;i<12;i++)
                   {
                       if (preguntas_ya_realizadas[i]==aleatorio_pregunta)
                       {
                           fallidos++;
                       }

                   }
                   if (fallidos==0)
                   {
                       numero_pregunta=aleatorio_pregunta;
                       preguntas_ya_realizadas[ronda]=numero_pregunta;
                       contador=1;
                       ronda++;
                   }
           }

           JOptionPane.showMessageDialog(null,"Acontinuacion la pregunta del oponente: (si o no)");
           String respuesta_usuario=(String) JOptionPane.showInputDialog(null,"Pregunta "+preguntas[numero_pregunta]);
           /*analizamos la respuesta que le dimos a la computadora*/
           if (respuesta_usuario.equals("si"))
           {
               switch (numero_pregunta+1)
               {
                   case 1: aciertos_computador[1]="negro";
                   break;
                   case 2: aciertos_computador[1]="rubio";
                   break;
                   case 3: aciertos_computador[1]="marron";
                   break;
                   case 4: aciertos_computador[1]="pelirrojo";
                   break;
                   case 5: aciertos_computador[2]="negra";
                   break;
                   case 6: aciertos_computador[2]="blanca";
                   break;
                   case 7: aciertos_computador[3]="lentes";
                   break;
                   case 8: aciertos_computador[4]="hombre";
                   break;
                   case 9: aciertos_computador[4]="mujer";
                   break;
                   case 10: aciertos_computador[5]="barba";
                   break;
                   case 11: aciertos_computador[5]="bigote";
                   break;
                   case 12: aciertos_computador[5]="pendiente";
                   break;
               }
           }
           else
           {
               switch (numero_pregunta+1)
               {
                   case 5: aciertos_computador[2]="blanca";
                   case 6: aciertos_computador[2]="negra";
                   case 7: aciertos_computador[3]="no lentes";
                   case 8: aciertos_computador[4]="mujer";
                   case 9: aciertos_computador[4]="hombre";
               }
           }
           /*vemos si la computadora adivino*/

           intento_computadora=adivinar_computadora(datos_computadora,aciertos_computador);
           if (!intento_computadora.equals("vacio"))
           {
               personaje_usuario=intento_computadora;
           }





           /*presentamos la lista de posibles aciertos*/
           int numero_personajes=0;
           for (int i=0;i<24;i++)
           {
               if(datos_usuario[i][0]!="eliminado")
               {
                  numero_personajes=numero_personajes+1;
               }
           }
           String []personajes_restantes=new String[numero_personajes];
           int j=0;
           for (int i=0;i<24;i++)
           {
               if (datos_usuario[i][0]!="eliminado")
               {
                   personajes_restantes[j]=datos_usuario[i][0];
                   j++;
               }
           }




           /*presentammos la lista de nombres que pueden ser los personajes*/
           String sobrante="\n"+Arrays.toString(personajes_restantes);
           JOptionPane.showMessageDialog(null,sobrante,"POSIBLES PERSONAJES DEL OPONENTE EN LA SIG.LISTA",
                   JOptionPane.DEFAULT_OPTION,
                   new ImageIcon(Main.class.getResource("imagenes/personajes.jpeg"))
                   );
           intento=JOptionPane.showInputDialog(null,"Deseas adivinar el personaje?(si o no)");

       }







       if (Objects.equals(personaje_usuario, aciertos_usuario[0]))
       {
           JOptionPane.showMessageDialog(null,"USUARIO 2 GANADOR","GAME OVER",
                   JOptionPane.DEFAULT_OPTION,
                   new ImageIcon(Main.class.getResource("imagenes/gameover.jpg"))
           );
       }

       String personaje_computadora=(String) JOptionPane.showInputDialog(null,"Ingrese el nombre del personaje");
           if (Objects.equals(personaje_computadora, computador[0]))
           {
               JOptionPane.showMessageDialog(null,"FELICIDADES!!!","WINS",
                       JOptionPane.DEFAULT_OPTION,
                       new ImageIcon(Main.class.getResource("imagenes/ganastes.jpg"))
               );
           }
           else
           {
               JOptionPane.showMessageDialog(null,"USUARIO 2 GANADOR","GAME OVER",
                       JOptionPane.DEFAULT_OPTION,
                       new ImageIcon(Main.class.getResource("imagenes/gameover.jpg"))
               );
           }


    }
    public static int validar (String[] usuario, int pregunta){
            int confirmacion=0;
            switch (pregunta)
            {
                case 1:{
                        if (usuario[1].equals("negro"))
                        {
                            confirmacion++;
                        }
                }
                break;
                case 2:{
                        if (usuario[1].equals("rubio"))
                        {
                            confirmacion++;
                        }
                }
                break;
                case 3:{
                        if (usuario[1].equals("marron"))
                        {
                            confirmacion++;
                        }
                }
                case 4:{
                    if (usuario[1].equals("pelirrojo"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 5:{
                    if (usuario[2].equals("negra"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 6:{
                    if (usuario[2].equals("blanca"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 7:{
                    if (usuario[3].equals("lentes"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 8:{
                    if (usuario[4].equals("hombre"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 9:{
                    if (usuario[4].equals("mujer"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 10:{
                    if (usuario[5].equals("barba"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 11:{
                    if (usuario[5].equals("bigote"))
                    {
                        confirmacion++;
                    }
                }
                break;
                case 12:{
                    if (usuario[5].equals("pendiente"))
                    {
                        confirmacion++;
                    }
                }
                break;
            }
            return confirmacion;

    }
    public static int aleatorio_personaje(){
        int posicion;
        posicion=(int) (Math.random()*23);
        return posicion;
    }
    public static int aleatorio(){
        int posicion;
        posicion=(int) (Math.random()*12);
        return posicion;
    }
    public static String adivinar_computadora(String[][] datos,String[] informacion){
        String respuesta="vacio";
          for (int i=0;i<24;i++)
          {
              if(datos[i][1]==informacion[1])
              {
                  if (datos[i][2]==informacion[2])
                  {
                      if (datos[i][3]==informacion[3])
                      {
                          if (datos[i][4]==informacion[4])
                          {
                              if (datos[i][5]==informacion[5])
                              {
                                  respuesta=datos[i][0];
                              }
                          }
                      }
                  }
              }

          }
          return respuesta;
    }
}
