package impl;

import service.Printer;

public class BadPrinter implements Printer {
    public void print() {
        System.out.println("i am bad printer");
    }
}
