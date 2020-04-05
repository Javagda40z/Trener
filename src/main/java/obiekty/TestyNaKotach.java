package obiekty;

//Pokazanie czym jest enkapsulacja/hermetyzacja
public class TestyNaKotach {

    public static void main(String[] args) {
        Cat filemon = new Cat();
        System.out.println(filemon.getLicznikZlapanychMyszy());
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        System.out.println(filemon.getLicznikZlapanychMyszy());

        if (czyPowinienDostacMleko(filemon)) {
            System.out.println("Daje mleko dla kota");
        } else {
            System.out.println("Za malo zjedzonych myszy, zjedz wiecej to dostaniesz mleko");
        }

    }

    public static boolean czyPowinienDostacMleko(Cat cat) {

        if (cat.getLicznikZlapanychMyszy() > 10) {
            return true;
        } else {
            return false;
        }

    }
}
