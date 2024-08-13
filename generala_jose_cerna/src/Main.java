import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        int [] dados=new int[5];


        String[] categorias_ya_formadas_jugador_uno=new String[11];
        String[] categorias_ya_formadas_jugador_dos=new String[11];
        int[] puntos_jugador_uno=new int[11];
        int[] puntos_jugador_dos=new int[11];
        int contador_rondas_jugador_uno=0;
        int contador_rondas_jugador_dos=0;
        int contador_rondas_general=1;

        String []categorias_jugador_uno=new String[11];
        categorias_jugador_uno[0]="uno";categorias_jugador_uno[1]="dos";categorias_jugador_uno[2]="tres";categorias_jugador_uno[3]="cuatro";categorias_jugador_uno[4]="cinco";categorias_jugador_uno[5]="seis";categorias_jugador_uno[6]="escalera";
        categorias_jugador_uno[7]="full";categorias_jugador_uno[8]="poker";categorias_jugador_uno[9]="generala";categorias_jugador_uno[10]="doble generala";

        String []categorias_jugador_dos=new String[11];
        categorias_jugador_dos[0]="uno";categorias_jugador_dos[1]="dos";categorias_jugador_dos[2]="tres";categorias_jugador_dos[3]="cuatro";categorias_jugador_dos[4]="cinco";categorias_jugador_dos[5]="seis";categorias_jugador_dos[6]="escalera";
        categorias_jugador_dos[7]="full";categorias_jugador_dos[8]="poker";categorias_jugador_dos[9]="generala";categorias_jugador_dos[10]="doble generala";

        String reglas="El objetivo del juego es sumar la mayor cantidad de puntos en cada categoria.\n" +
                "Tiraran los dados cada jugador, en cada ronda el jugador debe elegir que\n" +
                "categoria desea formar, en cada ronda puede tirar hazta maximo 3 tiros\n" +
                "\n" +
                "CATEGORIAS\n" +
                "Categoria del uno al seis, se suman los puntos de los dados\n" +
                "Cateforia Escalera se forman con numeros consecutivos 25 puntos si es en un tiro 20 puntos caso contrario\n" +
                "Categoria Full se forma con 2 dados iguales y 3 dados iguales 35 puntos si es en un tiro 30 puntos caso contrario\n" +
                "Categoria Poker se forma con 4 dados iguales 45 puntos si es en un tiro 40 puntos caso contrario\n" +
                "Categoria Generala se forma con todos los dados iguales son 50 puntos\n" +
                "Categoria Doble Generala se forma cuando todos los dados son unos 100 puntos\n" +
                "\n" +
                "A jugar!!!";

        JOptionPane.showMessageDialog(null, new ImageIcon(Main.class.getResource("imagenes/logo.png")), "Generala",
                JOptionPane.DEFAULT_OPTION);

        JOptionPane.showMessageDialog(null,reglas,"Reglas del Juego",JOptionPane.DEFAULT_OPTION);


        do {

            for (int i=0;i<5;i++)
            {
                dados[i]=generador_dado();
            }

            ImageIcon[] primeros_dados=new ImageIcon[5];
            if (contador_rondas_general%2!=0)
            {
                for (int i=0;i<5;i++)
                {
                    primeros_dados[i]=new ImageIcon("src/imagenes/dado_"+dados[i]+"_jugador1.jpg");
                }
            }
            else{
                if (contador_rondas_general%2==0)
                {
                    for (int i=0;i<5;i++)
                    {
                        primeros_dados[i]=new ImageIcon("src/imagenes/dado_"+dados[i]+"_jugador2.jpg");
                    }
                }
            }

            JPanel panel=new JPanel();
            panel.setLayout(new GridLayout(2,1));

            for (ImageIcon image:primeros_dados)
            {
                JLabel label=new JLabel(image);
                panel.add(label);
            }

            JOptionPane.showMessageDialog(null, panel, "Dados primer tiro", JOptionPane.INFORMATION_MESSAGE);
            String pregunta_adicional_dado=(String) JOptionPane.showInputDialog(null,"Desea volver a tirar:(si/no)");
            int tiro=0;

            if (pregunta_adicional_dado.equals("si"))
            {

                String pregunta_adicional_dado_segunda="";
                do {
                    int contador_dados_aceptados=0;

                    for (int i=0;i<5;i++)
                    {
                        String pregunta_dado_aceptado;
                        pregunta_dado_aceptado= (String) JOptionPane.showInputDialog(null,"Un 'si' para que ese dado se vuelva a tirar, caso omiso un 'no'",
                                "Selector de dados",JOptionPane.PLAIN_MESSAGE,new ImageIcon(Main.class.getResource("imagenes/dado_"+dados[i]+"_jugador1.jpg")),null,"");
                        if (pregunta_dado_aceptado.equals("si"))
                        {
                            dados[i]=0;
                        }
                    }
                    for (int i=0;i<5;i++)
                    {
                        int a=generador_dado();
                        if (dados[i]==0)
                        {
                            dados[i]=a;
                        }
                    }
                    tiro++;

                    if (tiro<2)
                    {
                        ImageIcon[] nuevos_dados=new ImageIcon[5];
                        for (int i=0;i<5;i++)
                        {
                            nuevos_dados[i]=new ImageIcon("src/imagenes/dado_"+dados[i]+"_jugador1.jpg");
                        }

                        JPanel panel2=new JPanel();
                        panel2.setLayout(new GridLayout(2,1));

                        for (ImageIcon image:nuevos_dados)
                        {
                            JLabel label=new JLabel(image);
                            panel2.add(label);
                        }
                        JOptionPane.showMessageDialog(null, panel2,"Dados segundo tiro", JOptionPane.INFORMATION_MESSAGE);
                        pregunta_adicional_dado_segunda=(String) JOptionPane.showInputDialog(null,"Desea volver a tirar:(si/no)");
                    }

                }while (pregunta_adicional_dado_segunda.equals("si") && tiro<2);
            }

            ImageIcon[] dados_final=new ImageIcon[5];
            if (contador_rondas_general%2!=0)
            {
                for (int i=0;i<5;i++)
                {
                    dados_final[i]=new ImageIcon("src/imagenes/dado_"+dados[i]+"_jugador1.jpg");
                }
            }
            else{
                if (contador_rondas_general%2==0)
                {
                    for (int i=0;i<5;i++)
                    {
                        dados_final[i]=new ImageIcon("src/imagenes/dado_"+dados[i]+"_jugador2.jpg");
                    }
                }
            }

            JPanel panel3=new JPanel();
            panel3.setLayout(new GridLayout(2,1));

            for (ImageIcon image:dados_final)
            {
                JLabel label=new JLabel(image);
                panel3.add(label);
            }
            JOptionPane.showMessageDialog(null, panel3,"Dados final", JOptionPane.INFORMATION_MESSAGE);

            if ((contador_rondas_general % 2) != 0) {
                String seleccion_categorias = "Escriba en el recuadro la categoria disponible a seleccionar: \n" + Arrays.toString(categorias_jugador_uno) + "\n";
                String pregunta_categoria;
                pregunta_categoria = (String) JOptionPane.showInputDialog(null, seleccion_categorias, "Seleccionar Categoria (Jugador 1)", JOptionPane.PLAIN_MESSAGE);
                categorias_ya_formadas_jugador_uno[contador_rondas_jugador_uno]=pregunta_categoria;
                switch (pregunta_categoria) {
                    case "uno":
                    case "dos":
                    case "tres":
                    case "cuatro":
                    case "cinco":
                    case "seis":
                        puntos_jugador_uno[contador_rondas_jugador_uno] = categoria_uno_seis(dados, pregunta_categoria);
                        break;
                    case "escalera":
                        puntos_jugador_uno[contador_rondas_jugador_uno] = categoria_escalera(dados, tiro);
                        break;
                    case "full":
                        puntos_jugador_uno[contador_rondas_jugador_uno] = categoria_full(dados, tiro);
                        break;
                    case "poker":
                        puntos_jugador_uno[contador_rondas_jugador_uno] = categoria_poker(dados, tiro);
                        break;
                    case "generala":
                        puntos_jugador_uno[contador_rondas_jugador_uno] = categoria_generala(dados);
                        break;
                    case "doble generala":
                        puntos_jugador_uno[contador_rondas_jugador_uno] = categoria_doble_generala(dados);
                        break;
                }

                for (int i = 0; i < 11; i++) {
                    if (categorias_jugador_uno[i].equals(pregunta_categoria)) {
                        categorias_jugador_uno[i]= "No Disponible";
                    }
                }
                contador_rondas_jugador_uno++;

            }

            else {
                if ((contador_rondas_general % 2) == 0){

                    String seleccion_categorias = "Escriba en el recuadro la categoria disponible a seleccionar: \n" + Arrays.toString(categorias_jugador_dos) + "\n";
                    String pregunta_categoria = (String) JOptionPane.showInputDialog(null, seleccion_categorias, "Seleccionar Categoria (Jugador 2)", JOptionPane.PLAIN_MESSAGE);
                    categorias_ya_formadas_jugador_dos[contador_rondas_jugador_dos]=pregunta_categoria;
                    switch (pregunta_categoria) {
                        case "uno":
                        case "dos":
                        case "tres":
                        case "cuatro":
                        case "cinco":
                        case "seis":
                            puntos_jugador_dos[contador_rondas_jugador_dos] = categoria_uno_seis(dados, pregunta_categoria);
                            break;
                        case "escalera":
                            puntos_jugador_dos[contador_rondas_jugador_dos] = categoria_escalera(dados, tiro);
                            break;
                        case "full":
                            puntos_jugador_dos[contador_rondas_jugador_dos] = categoria_full(dados, tiro);
                            break;
                        case "poker":
                            puntos_jugador_dos[contador_rondas_jugador_dos] = categoria_poker(dados, tiro);
                            break;
                        case "generala":
                            puntos_jugador_dos[contador_rondas_jugador_dos] = categoria_generala(dados);
                            break;
                        case "doble generala":
                            puntos_jugador_dos[contador_rondas_jugador_dos] = categoria_doble_generala(dados);
                            break;
                    }

                    for (int i = 0; i < 11; i++) {
                        if (categorias_jugador_dos[i].equals(pregunta_categoria)) {
                            categorias_jugador_dos[i]= "No disponible";
                        }
                    }
                    contador_rondas_jugador_dos++;
                }
            }

            contador_rondas_general++;
        }while (contador_rondas_general!=22);

        int suma_jugador_uno=0;
        int suma_jugador_dos=0;
        for (int i=0;i<11;i++)
        {
            suma_jugador_uno+=puntos_jugador_uno[i];
            suma_jugador_dos+=puntos_jugador_dos[i];
        }

        String resultados_jugador_uno = "Resultados:\n"+Arrays.toString(categorias_ya_formadas_jugador_uno)+"\n"+Arrays.toString(puntos_jugador_uno)+
                                        "Suma total"+suma_jugador_uno;
        JOptionPane.showMessageDialog(null,resultados_jugador_uno,"Resultados del Jugador 1",JOptionPane.INFORMATION_MESSAGE);

        String resultados_jugador_dos = "Resultados:\n"+Arrays.toString(categorias_ya_formadas_jugador_uno)+"\n"+Arrays.toString(puntos_jugador_dos)+
                "Suma total"+suma_jugador_dos;
        JOptionPane.showMessageDialog(null,resultados_jugador_dos,"Resultados del Jugador 2",JOptionPane.INFORMATION_MESSAGE);

        if (suma_jugador_uno>suma_jugador_dos)
        {
            JOptionPane.showMessageDialog(null,"Ganador","Ganador jugador 1",JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(Main.class.getResource("imagenes/ganastes.jpg")));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Ganador","Ganador jugador 2",JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(Main.class.getResource("imagenes/ganastes.jpg")));
        }

    }
    public static int generador_dado(){
        int dado;
        dado=(int) (Math.random()*6)+1;
        return dado;
    }
    public static int categoria_uno_seis(int[]dados,String categoria)
    {
        int suma=0;
        switch (categoria)
        {
            case "uno":
            {
                for (int i=0;i<5;i++)
                {
                    if (dados[i]==1)
                    {
                        suma += dados[i];
                    }
                }
            } break;
            case "dos":
            {
                for (int i=0;i<5;i++)
                {
                    if (dados[i]==2)
                    {
                        suma += dados[i];
                    }
                }
            } break;
            case "tres":
            {
                for (int i=0;i<5;i++)
                {
                    if (dados[i]==3)
                    {
                        suma += dados[i];
                    }
                }
            } break;
            case "cuatro":
            {
                for (int i=0;i<5;i++)
                {
                    if (dados[i]==4)
                    {
                        suma += dados[i];
                    }
                }
            } break;
            case "cinco":
            {
                for (int i=0;i<5;i++)
                {
                    if (dados[i]==5)
                    {
                        suma += dados[i];
                    }
                }
            } break;
            case "seis":
            {
                for (int i=0;i<5;i++)
                {
                    if (dados[i]==6)
                    {
                        suma += dados[i];
                    }
                }
            } break;
        }
        return suma;
    }
    public static int categoria_escalera(int[] dados,int tiros)
    {
        int[]escalera={2,3,4,5,6,1};
        int aciertos=0;
        int retornara=0;

        for (int i=0;i<7;i++)
        {
            for (int j=0;j<5;j++)
            {
                if (escalera[i]==dados[j])
                {
                    aciertos++;
                }
            }
        }
        if (aciertos==5)
        {
            if (tiros==0)
            {
                retornara=25;
            }
            else
                retornara=20;
        }
        return retornara;

    }
    public static int categoria_full(int[] dados,int tiros)
    {
        int puntos=0;
        int[] full=new int[6];
        int aciertos=0;
        for (int i=0;i<5;i++)
        {
            switch (dados[i])
            {
                case 1: full[0]++;
                    break;
                case 2: full[1]++;
                    break;
                case 3: full[2]++;
                    break;
                case 4: full[3]++;
                    break;
                case 5: full[4]++;
                    break;
                case 6: full[5]++;
                    break;
            }
        }
        for (int i=0;i<5;i++)
        {
            switch (full[i])
            {
                case 2: aciertos=aciertos+2;
                break;
                case 3: aciertos=aciertos+3;
            }
        }
        if (aciertos==5)
        {
            if (tiros==0){
                puntos=35;
            }
            else {
                puntos=30;
            }
        }
        else {
            puntos=0;
        }
       return puntos;
    }
    public static int categoria_poker(int[] dados,int tiros){
        int puntos=0;
        int[] poker=new int[6];
        int aciertos=0;
        for (int i=0;i<5;i++)
        {
            switch (dados[i])
            {
                case 1: poker[0]++;
                    break;
                case 2: poker[1]++;
                    break;
                case 3: poker[2]++;
                    break;
                case 4: poker[3]++;
                    break;
                case 5: poker[4]++;
                    break;
                case 6: poker[5]++;
                    break;
            }
        }
        for (int i=0;i<5;i++)
        {
            switch (poker[i])
            {
                case 4:
                    aciertos++;
                    break;
            }
        }
        if (aciertos==1)
        {
            if (tiros==0){
                puntos=45;
            }
            else {
                puntos=40;
            }
        }
        else {
            puntos=0;
        }
        return puntos;
    }
    public static int categoria_generala(int[] dados)
    {
        int puntos=0;
        if (dados[0]==dados[1] && dados[1]==dados[2] && dados[2]==dados[3] && dados[3]==dados[4])
        {
            puntos=50;
        }
        else {
            puntos=0;
        }
        return puntos;
    }
    public  static int categoria_doble_generala(int[] dados)
    {
        int puntos=0;
        if (dados[0]==1 && dados[1]==1 && dados[2]==1 && dados[3]==1 && dados[4]==1)
        {
            puntos=100;
        }
        else {
            puntos=0;
        }
        return puntos;
    }
}
