import Intefaces.Printable;

public class Main {
    public static void main(String[] args) {
        Book Viy = new Book("Вий");
        Magazine playBoy = new Magazine("Плейбой");
        Book warAndPeace = new Book("Война и мир");
        Magazine Sudar = new Magazine("Сударь");

        Printable[] printable;
        printable = new Printable[] {
                Viy, playBoy, warAndPeace, Sudar
        };

        for (Printable print : printable){
            print.print();
        }
    }
}