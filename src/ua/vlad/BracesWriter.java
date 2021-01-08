package ua.vlad;

public class BracesWriter implements Writer {
    public void Write(String text) {
        System.out.println("{" + text + "}");
    }
}