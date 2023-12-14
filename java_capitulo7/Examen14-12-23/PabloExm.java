/* ******************************************************************************* */
/*   File:PabloExm.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/12/14 08:26                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/12/14 08:26												       */
/*                                                                                 */
/* ******************************************************************************* */
public class PabloExm
{
    //Colores
    public static final String RED = "\033[0;31m"; // RED
    public static final String GREEN = "\033[0;32m"; // GREEN
    public static final String YELLOW = "\033[0;33m"; // YELLOW
    public static final String BLUE = "\033[0;34m"; // BLUE
    public static final String PURPLE = "\033[0;35m"; // PURPLE
    public static final String CYAN = "\033[0;36m"; // CYAN
    public static final String WHITE = "\033[0;37m"; // WHITE
    //Funcion creaCanvas
    public static String[][][] creaCanvas(int filas, int columnas)
    {
        String [][][] canvas = new String[filas][columnas][2];
        return canvas;
    }

    //Funcion inicializaCanvas
    public static String [][][] inicializaCanvas(String [][][] canvas)
    {
        for (int i = 0; i < canvas.length; i++)
        {
            for (int j = 0; j < canvas.length; j++)
            {
                canvas [i][j][0] = " ";
            }
        }

        for (int i = 0; i < canvas.length; i++)
        {
            for (int j = 0; j < canvas.length; j++)
            {
                canvas[i][j][1] = "0";
            }
        }
        return canvas;
    }

    //Funcion imrpimeCampanas
    public static void imprimeCampanas(int n)
    {
        for (int i = 0; i <  n; i++)
        {
          System.out.print(YELLOW+"\uD83D\uDD14");  
        }
        System.out.println();
    }

    //Funcion para imrprimir el Canvas
    public static void imprimeCanvas(String [][][] canvas)
    {

        for (int i = 0; i < canvas.length; i++)
        {
            for (int j = 0; j < canvas.length; j++)
            {
                if (Integer.parseInt(canvas[i][j][1]) > 0)
                    System.out.print(canvas[i][j][0]);
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    //Funcion para obtener colores aleatorios.
    public static String obtenerColorAleatorio()
    {
        int opcion = (int)(Math.random()*7);
        String color = "";
        switch (opcion) {
            case 0:
                color = RED;
                break;
            case 1:
                color = GREEN;
                break;
            case 2:
                color = YELLOW;
                break;
            case 3:
                color = BLUE;
                break;
            case 4:
                color = PURPLE;
                break;
            case 5:
                color =  CYAN;
                break;
            case 6:
                color =  WHITE;
                break;
            default:
                break;
        }
        return color;
    }

    //Funcion para insertar copos de nieves de colores
    public static void insertaNieve(String [][][] canvas)
    {
        for (int i = canvas.length-1; i > 0; i--)
        {
            for (int j = 0; j < canvas.length; j++)
            {
                canvas[i][j][0]=canvas[i-1][j][0];
                int valorProfundidad1 = Integer.parseInt(canvas[i-1][j][1])-1;
                canvas[i][j][1] = ""+valorProfundidad1;
            }    
        }

        for (int i = 0; i < canvas[0].length; i++)
        {
            double siCopoNieve = (Math.random());
            if (siCopoNieve > 0.5)
            {
                canvas[0][i][0] = obtenerColorAleatorio()+"❆ ";
                int alturaMatrizRandom = (int)(Math.random()*canvas.length);
                canvas[0][i][1] = ""+alturaMatrizRandom;
            }
            else
            {
                canvas[0][i][0] = "  ";
                canvas[0][i][1] = "0";
            }
        }


    }

    //Funcion para borrar la consola
    public static void borraConsola(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            System.out.print("\033[1A"); //sube el cursor a la línea anterior
        System.out.print("\033[2K"); //borra el contenido de la línea actual
        }
    }
    //Funcion main para probar el codigo y las funciones    
    public static void main(String[] args)throws InterruptedException
    {
        
        String [][][] miCanvas = creaCanvas(15, 15);
        inicializaCanvas(miCanvas);
        for (int i = 0; i < 500; i++)
        {
            imprimeCampanas(15);
            insertaNieve(miCanvas);
            imprimeCanvas(miCanvas);
            Thread.sleep(50);
            borraConsola(miCanvas.length+1);

        }
    }
}


//El alto de la matriz es el numero de filas
//Las columnas es el ancho de la matriz