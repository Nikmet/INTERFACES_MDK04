import Intefaces.Printable;

import java.io.Console;

public class Book implements Printable {

    String name;
    public Book(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
