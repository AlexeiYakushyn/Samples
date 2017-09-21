package lesson_24;

/**
 * Created by java2 on 21.09.17.
 */
public class Wait implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Tic");
           wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
