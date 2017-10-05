package lesson_28;

import java.util.Date;

/**
 * Created by java2 on 05.10.17.
 */

public class Human {

    String name;
    int birthDate;
    String sex;

    public enum gender {MALE, FEMALE}

    public Human(String name, int birthDate, String sex) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
    }
}
