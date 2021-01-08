package ua.vlad;

public interface Requester {
    boolean Connect();
    String Send(String message);
}
