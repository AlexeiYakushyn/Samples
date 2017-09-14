package lesson_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by java2 on 11.09.17.
 */
public class RunnableThread implements Runnable {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {

        try {
            System.out.println("Enter something : ");
            String line = reader.readLine();

        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
