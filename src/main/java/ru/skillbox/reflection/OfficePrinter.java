package ru.skillbox.reflection;

public class OfficePrinter implements Printer {
    @Override
    public void on() {
        System.out.println("Printer is on");
    }

    @Override
    public void print(String document) {
        System.out.println("Print: " + document);
    }

    @Override
    public void printSecret(String secretDocument) {
        System.out.println("Print (TOP SECRET): ");
    }

    @Override
    public void off() {
        System.out.println("Printer is off!");
    }
}
