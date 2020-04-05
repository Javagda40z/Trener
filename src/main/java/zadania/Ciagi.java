package zadania;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ciagi {

    public static void main(String[] args) {

//        List<Integer> lista = new ArrayList<>();
//        ///
//        lista.add(15);
//        lista.add(20);
//        lista.add(30);
//
//        System.out.println(lista);
//        lista.add(444);
//        System.out.println(lista);
//        lista.remove(0);
//        System.out.println(lista);
//        System.out.println(stworzCiagArytmetyczny(5, 1, 1));

        List<String> listaPracownikow = new LinkedList<String>();
        listaPracownikow.add("Mateusz");
        listaPracownikow.add("Mateusz2");
        listaPracownikow.add("Marika");

        List<String> listaPracownikowZInnegoDzialu = new ArrayList<String>();

        listaPracownikowZInnegoDzialu.add("Mateusz1");
        listaPracownikowZInnegoDzialu.add("Mateusz3");
        listaPracownikowZInnegoDzialu.add("Marika2");

        dajPodwyzke(listaPracownikow);
        dajPodwyzke(listaPracownikowZInnegoDzialu);

    }


    public static void dajPodwyzke(List<String> pracownicy) {
        //daje podwyzke kazdemu pracownikowi

    }


    //Napisz funkcję tworzącą ciąg arytmetyczny o podanych:
    //długości, pierwszym elemencie, różnicy ciągu 

    public static List<Integer> stworzCiagArytmetyczny(int dlugosc, int pierwszy, int roznica) {
        List<Integer> ciag = new LinkedList<Integer>();

        ciag.add(pierwszy);
        for (int i = pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i * roznica);
        }
        return ciag;
    }
}
