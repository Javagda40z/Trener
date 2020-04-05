package petle;

public class Application {

    public static void main(String[] args) {

//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= 0; i--) {
//
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while (i <= 100) {
//            System.out.println(i);
//            i++;
//        }
//
//        for (int j = 300; j <= 1000; j++) {
//
//            if (j%2 == 0 && j % 3 == 0) {
//                System.out.println(j);
//            }
//
//        }

        String napis = "Jestem na dobrej drodze do zostania profesjonalnym programistą Java";


//        for (int i = 1; i <= 10; i++) {
//            System.out.println("nr: " + i + napis);
//        }
//
//        System.out.println(napis.length());
//
//        for (int i = 0; i < napis.length(); i = i + 2) {
//            System.out.print(napis.charAt(i));
//        }
//
//        for (int i = napis.length() - 1; i >= 0; i--) {
//            System.out.print(napis.charAt(i));
//        }
//
//        while (true) {
//            System.out.println(napis);
//        }
        dodawanie(0,1,5);

    }

    public static void dodawanie(int a, int b, int c) {

        int suma = 0;

        while (suma < c) {
            suma = suma + (a + b);
        }
        System.out.println(suma);
    }
}
