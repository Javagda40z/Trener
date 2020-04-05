package obiekty;

public class Cat implements Animal {

    private int licznikZlapanychMyszy = 0;

    public void drap() {
        //kot drapie
    }

    public void eatMouse() {
        licznikZlapanychMyszy++; // <-> licznik = licznik + 1;
        System.out.println("Zjadłem " + licznikZlapanychMyszy + " myszy");

    }

    @Override
    public void makeSound() {
        System.out.println("Miauuuuuuuu!");
    }

    public int getLicznikZlapanychMyszy() {
        return licznikZlapanychMyszy;
    }
}
