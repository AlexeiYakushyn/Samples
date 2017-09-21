package lesson_24;

/**
 * Created by java2 on 21.09.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {


        Wait w1 = new Wait();
        Wait w2 = new Wait();
        Notify n1 = new Notify();

        new Thread(w1).start();
        Thread.sleep(1000);
        new Thread(n1).start();

    }
}
