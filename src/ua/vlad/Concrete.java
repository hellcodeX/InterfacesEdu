package ua.vlad;

public class Concrete implements Requester {
    public boolean Connect() {
        return false;
    }

    public String Send(String message) {
        doSomeUnreal(); // <-- непрямой вызов с Main класа через Send()
        return null;
    }

    public void doSomeUnreal() {
        System.out.println("It's a magic!");
    }
}
