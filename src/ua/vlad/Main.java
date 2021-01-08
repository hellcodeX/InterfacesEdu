package ua.vlad;

public class Main {

    public static void main(String[] args) {
        Requester req = new Concrete(); // приведение класа к интерфейсу - UPCAST
        req.Connect();
        req.Send("Hello!"); // методы которые были определены только в класе исчезли,
                            // однико они недоступны только для их ПРЯМОГО вызова, но они существуют +
                            // публичные методы становяться приватными - проявление инкапсуляции!
        // req.doSomeUnreal(); не сработает так как в интерфейсе нету данного метода

        // После приведения к обоим интерфейсам эта функция будет с одной и тойже реализацией
        Interface2 inter2 = new Concrete2();
        Interface1 inter1 = new Concrete2();

        inter1.doSome();
        inter2.doSome();

        TextWorker textWorker = new TextWorker();
        textWorker.writer = new StandartWriter();
        textWorker.WriteText("TEXT");
        textWorker.writer = new BracesWriter();
        textWorker.WriteText("TEXT");
        textWorker.writer = new SquareWriter();
        textWorker.WriteText("TEXT");
    }
}
