package ua.vlad;

interface Interface1 {
    void doSome();
}

interface  Interface2 {
    void doSome();
}

public class Concrete2 implements Interface1, Interface2 {
    // После преведения к обоим интерфейсам эта функция будет с одной и тойже реализацией
    public void doSome() {
        System.out.println("doSome - Inter1 and Inter2 implemented");
    }
}
