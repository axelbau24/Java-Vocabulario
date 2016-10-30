import java.util.*;

public class IteradorOcurrencias implements Iterator<String> {

    List<Map.Entry<String, Integer>> elems;
    int pos;

    public IteradorOcurrencias(Set<Map.Entry<String, Integer>> elementos){
        elems = new ArrayList<>(elementos);
        elems.sort(new OcurrenciasComparator());
        pos = 0;
    }


    public boolean hasNext(){
        return pos < elems.size();
    }

    public String next(){
        String aux = elems.get(pos).getKey();
        pos++;
        return aux;
    }

}