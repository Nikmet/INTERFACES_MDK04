package Exesize1;

import Exesize1.Intefaces.Printable;

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

        System.out.println();
        Magazine.printMagazines(printable);

        System.out.println();
        Book.printBooks(printable);
    }
}