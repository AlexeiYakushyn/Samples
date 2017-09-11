package lesson_18;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by java2 on 04.09.17.
 */
public class ForTest  {

    public List<Integer> returnIntLength(List<String> list)  {

        List<Integer> integers = new ArrayList<>();

        if (list == null) throw new IllegalArgumentException("must be not Null");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                integers.add(-1);
            } else {
                integers.add(list.get(i).length());
            }
        }

        return integers;
    }
}
