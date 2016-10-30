import java.util.*;

public class Vocabulario{

    Map<String, Integer> palabras;

    public Vocabulario(String texto){

        palabras = new HashMap<>();
        String[] pals = texto.split(" ");
        for(String s : pals){
            if(palabras.containsKey(s)){
                palabras.put(s, palabras.get(s) + 1);
            }
			else palabras.put(s, 1);
        }

    }

    public Iterator iteratorAlfabetico(){
        return new IteradorAlfabetico(palabras.keySet());
    }
    public Iterator iteratorOcurrencias(){
        return new IteradorOcurrencias(palabras.entrySet());
    }

    public List<String> masFrecuentes(int n){
        List<String> pals = new ArrayList<>();
        Iterator<String> it = iteratorOcurrencias();

        int i = 0;
        while (it.hasNext() && i < n){
            i++;
            pals.add(it.next());
        }
        return pals;
    }

    public List<String> menosFrecuentes(int n){
        List<String> pals = new ArrayList<>(masFrecuentes(palabras.size()));
        List<String> retorno = new ArrayList<>();
        pals.sort(Collections.reverseOrder());
        int i = 0;
        while (i < n) {
            retorno.add(pals.get(i));
            i++;
        }
        return retorno;
    }

    public int getFrecuencia(String p){
        if(palabras.containsKey(p)){
            return palabras.get(p);
        }
        return 0;
    }

    public int cantPalabras(){
        return palabras.size();
    }

}





