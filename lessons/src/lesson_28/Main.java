package lesson_28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by java2 on 05.10.17.
 */
public class Main {
    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        List<Human> list = new ArrayList<>();

        humans.add(new Human("Vasja", 1972, "Male"));
        humans.add(new Human("Masja", 1982, "Female"));
        humans.add(new Human("Petja", 1992, "Male"));
        humans.add(new Human("Kolja", 2002, "Male"));
        humans.add(new Human("Lusja", 1997, "Female"));
        humans.add(new Human("Musja", 2007, "Female"));
        humans.add(new Human("Kombat", 1962, "Male"));
        humans.add(new Human("Brabus", 1999, "Male"));

       list.addAll(humans.stream()
               .filter(s -> s.birthDate > 1970 && s.sex == "Female")
               .collect(Collectors.toList()));
       
    }
}
