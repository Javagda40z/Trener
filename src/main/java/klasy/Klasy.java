package klasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Klasy {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("test");
        wypiszListe(arrayList);
        wypiszListe(linkedList);
        wypiszListe("asd");
    }

    public static void wypiszListe(Object lista) {
//        if (lista instanceof List) { //raczej tak nie robmy
        List napewnoLista = ((List) lista);

        napewnoLista.size();

//            System.out.println("To jest lista o rozmiarze " + napewnoLista.size());
//        } else {
//            System.out.println("To nie jest lista");
//        }
    }

}
