import java.util.*;

public class IteradorAlfabetico implements Iterator<String> {

    private List<String> elems;
    private int pos;

    public IteradorAlfabetico(Set<String> elementos){
        elems = new ArrayList<>(elementos);
        Collections.sort(elems);
        pos = 0;
    }

    public boolean hasNext(){
        return pos < elems.size();
    }

    public String next(){
        String aux = elems.get(pos);
        pos++;
        return aux;
    }

}

