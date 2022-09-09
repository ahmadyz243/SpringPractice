package domain;

import interfaces.Printable;

public class F implements Printable {
    @Override
    public void print() {
        System.out.println("hello F");
    }
}
