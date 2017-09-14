package lesson_21;

/**
 * Created by java2 on 11.09.17.
 */
public class TreadInheritance extends Thread {

    @Override
    public void run() {
        try {
            sleep(5000);
            System.out.println(getClass().getName() + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
