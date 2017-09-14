package lesson_22;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by java2 on 14.09.17.
 */
public class SyncString {

    private static Set<String> strings = new HashSet<>();

    private Lock lock = new ReentrantLock();

    public Set<String> getStrings() {
        return strings;
    }

    public Set<String> setString(String string) {
        this.lock.lock();
        try {

            String[] str = string.split(string);

            for (int i = 0; i < str.length; i++) {
                strings.add(str[i]);
            }

        } finally {
            this.lock.unlock();
        }
        return strings;
    }
}
