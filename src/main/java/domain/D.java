package domain;

import interfaces.Printable;

public class D implements Printable {
    @Override
    public void print() {
        System.out.println("hello D");
    }
}