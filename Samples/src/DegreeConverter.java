/**
 * Created by alexey.yakushyn on 16.06.2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DegreeConverter {

    public static double celsium;
    public static double fahrenheit;

    public static double fahrenheit2celsium(int fahrenheit) {

        return celsium = (fahrenheit - 32) / 1.8;
    }

    public static double celsium2farenheit(int celsium) {

        return fahrenheit = (celsium * 1.8) + 32;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));

        String a = "";
        while (!a.equals("exit")) {


            System.out.println("Для перевода градусов Цельсия в градусы Фаренгейта нажмите 1");
            System.out.println("Для перевода градусов Фаренгейта в градусы Цельсия нажмите 2");
            System.out.println("Для выхода введите exit");
            System.out.println("");
            a = scn.readLine();

            if (a.equals("1")) {
                System.out.println("Введите число в градусах Цельсия");
                int celsium = Integer.parseInt(scn.readLine());
                System.out.println(celsium + " градусов Цельсия равно " + celsium2farenheit(celsium) + " градусов Фаренгейта.");
                System.out.println("");
            }

            if (a.equals("2")) {
                System.out.println("Введите число в градусах Фаренгейта");
                int fahrenheit = Integer.parseInt(scn.readLine());
                System.out.println(fahrenheit + " градусов Фаренгейта равно " + fahrenheit2celsium(fahrenheit) + " градусов Цельсия.");
                System.out.println("");
            }

            if ( !a.equals("1") && !a.equals("2") && !a.equals("exit"))
            {
                System.out.println("Please make your choice!");
                System.out.println("");
            }

        }

    }
}


