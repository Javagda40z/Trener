package zadania;

public class Program {

    static int a;

    public static void main(String[] args) {
//        Program program = new Program();
//        program.tabliczkaMnozenia(5);
//        program.tabliczkaMnozenia(10);
//        tabliczkaMnozenia(5);

//
//        TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
//        System.out.println(tabliczkaMnozenia.getLiczba());
//        tabliczkaMnozenia.wypiszTabliczke();
//
//        tabliczkaMnozenia = new TabliczkaMnozenia(10);
//        tabliczkaMnozenia.wypiszTabliczke();


        //Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y


        //silnia - rekurencja
//        System.out.println(silnia(5));

//        System.out.println(sumaLiczb(1, 5));

        int i; // nie ma wartosci domyslnej

        System.out.println(a);
    }

    public static int sumaLiczb(int x, int y) {

        int suma = 0;
        for (int i = x; i <= y; i++) {
            suma = suma + i;
        }
        return suma;
    }

    // 5! = 5*4*3*2;
    // silnia(5) = 5 * silnia(4)
    // silnia(4) = 4*silnia(3)
    // ...
    // silnia(1) = 1
    // silnia(2) = 2
    // silnia(0) = 1;


    public static int silnia(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * silnia(a - 1);
    }


    public static void tabliczkaMnozenia(int liczba) {
        System.out.println("Tabliczka mnożenia dla liczby: " + liczba);
        for (int i = 1; i <= liczba; i++) {
            System.out.println(liczba + " x " + i + " = " + liczba * i);
        }
    }
    // Tabliczka mnożenia dla liczby 5:
    // 5 x 1 = 5
    // 5 x 2 = 10
    // 5 x 3 = 15
    // 5 x 4 = 20
    // 5 x 5 = 25
}
