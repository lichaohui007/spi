package main;

import com.sun.tools.javac.util.ServiceLoader;
import service.Printer;

public class MainApp {

    public static void main(String[] args){
        ServiceLoader<Printer> printerServiceLoader = ServiceLoader.load(Printer.class);
        for(Printer printer : printerServiceLoader){
            printer.print();
        }
    }

}
