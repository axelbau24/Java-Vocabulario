import java.util.Iterator;

public class Main {

    public static void main(String[] m){
        Vocabulario t1 = new Vocabulario("g b l l n l l n l l l l ab b b b b b b g h r w y s h a g a");

        System.out.println("Cantidad de palabras diferentes que contiene el texto: " + t1.cantPalabras());

        System.out.println("Palabras ordenadas alfabéticamente:");
        Iterator<String> it = t1.iteratorAlfabetico();
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("Palabras ordenadas por frecuencia de ocurrencia:");
        it = t1.iteratorOcurrencias();
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("N palabras más frecuentes:");
        int N = 2;
        for (String s : t1.masFrecuentes(N)) System.out.println(s);

        System.out.println("N palabras menos frecuentes:");
        N = 4;
        for (String s : t1.menosFrecuentes(N)) System.out.println(s);

        System.out.println("Frecuencia de ocurrencia de una palabra:");
        System.out.println(t1.getFrecuencia("n"));

    }
}