package java_capitulo9.Ejercicio3Array.Uuid;

public class MyUuid {
    public static String getUuid(int digits)
    {
        String ret = "";
        final char A = 'A';
        final char Zero = '0';
        for (int i = 1; i <= digits; i++)
        {
           if (Math.random()>0.5)
           {
            ret+= (char)((int)A+(int)(Math.random()*26));
           }
           else
            ret += (char)((int)Zero+(int)(Math.random()*10));
        }

        return ret;
    }
}
