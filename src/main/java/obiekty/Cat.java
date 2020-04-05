package obiekty;

public class Cat implements Animal {
    private static int licznikKotow = 0;
    private int licznikZlapanychMyszy = 0;
    private String imie;

//    private Cat(String imie) { // nie mozna stworzyc poza tą klasą
//        this.imie = imie;
//    }

    public Cat() {
        this("Kot o ID: " + licznikKotow);
        licznikKotow++;
    }

    public Cat(String imie) {
        this.imie = imie;
    }

    public static Cat stworzKota(String imie) { // to moze
        Cat kot = new Cat(imie);
        kot.licznikZlapanychMyszy = 50;
        return kot;
    }

    public void drap() {
        //kot drapie
    }

    public void eatMouse() {
        licznikZlapanychMyszy++; // <-> licznik = licznik + 1;
        System.out.println("Zjadłem " + licznikZlapanychMyszy + " myszy");

    }

    public int getLicznikZlapanychMyszy() {
        return licznikZlapanychMyszy;
    }

    @Override
    public void makeSound() {
        System.out.println("Miauuu!");
    }

    @Override
    public void move() {

        System.out.println("Chodzę");
    }

    public String getImie() {
        return imie;
    }
}
