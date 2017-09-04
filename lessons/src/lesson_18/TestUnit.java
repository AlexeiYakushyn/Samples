package lesson_18;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

/**
 * Created by java2 on 04.09.17.
 */

public class TestUnit {

    @Test
    public void happyTest() {
        ForTest forTest = new ForTest();

        ArrayList<String> list = new ArrayList<>();
        list.add("sdjkfhsjf");

        forTest.returnIntLength(list);

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = list.get(i).length();
        }
        assertEquals(9, result);
    }

    @Test
    public void testNull() {
        ForTest forTest = new ForTest();

        forTest.returnIntLength(null);

    }

    @Test
    public void addNullToList() {
        ForTest forTest = new ForTest();

        ArrayList<String> list = new ArrayList<>();
        list.add(null);

        forTest.returnIntLength(list);
    }

    @Test
    public void addZero() {
        ForTest forTest = new ForTest();
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("dgf");
        list.add(null);

        forTest.returnIntLength(list);
    }
}
