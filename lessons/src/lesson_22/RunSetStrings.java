package lesson_22;

import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by java2 on 14.09.17.
 */
public class RunSetStrings implements Runnable {


    private String str;

    public RunSetStrings(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println("Thread started work " + Thread.currentThread().getName());
        SyncString syncStr = new SyncString();
        syncStr.setString(str);
        System.out.println("Thread stopped " + Thread.currentThread().getName());

    }
}
