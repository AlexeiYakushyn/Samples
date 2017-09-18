package lesson_22;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by java2 on 14.09.17.
 */

public class SyncString {

    private static Set<String> strings = Collections.synchronizedSet(new HashSet<>());

    private Lock lock = new ReentrantLock();

    public Set<String> getStrings() {
        return strings;
    }

    public static synchronized Set<String> setString(String string) {
//        this.lock.lock();
//        try {
        for (int i = 0; i < string.length(); i++) {
            String[] str = string.split(" ");

            for (int j = 0; j < str.length; j++) {
                strings.add(str[j]);
            }
        }
//        } finally {
//            this.lock.unlock();
//        }
//       System.out.println(strings.size());
       // Collections.synchronizedSet(strings);
        return strings;
    }
}
