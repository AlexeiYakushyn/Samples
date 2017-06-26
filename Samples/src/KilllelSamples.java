/**
 * Created by degget on 16.06.2017.
 */
import java.util.Scanner;

public class KilllelSamples {

    public static double celsium;
    public static double fahrenheit;

    public static double celsium2farenheit(int fahrenheit) {

        return celsium = (fahrenheit - 32) / 1.8;
    }

    public static double fahrenheit2celsium(int celsium) {

        return fahrenheit = (celsium * 1.8) / 32;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        int i=0;
        while (i <= 3){


            System.out.println("Для перевода градусов Цельсия в градусы Фаренгейта нажмите 1");
            System.out.println("Для перевода градусов Фаренгейта в градусы Цельсия нажмите 2");
            System.out.println("");
            int a = scn.nextInt();

            if (a == 1) {
                System.out.println("Введите число в градусах Цельсия");
                int celsium = scn.nextInt();
                System.out.println(celsium + " градусов Цельсия равно " + fahrenheit2celsium(celsium) + " градусов Фаренгейта.");
                System.out.println("");
            }

            if (a == 2) {
                System.out.println("Введите число в градусах Фаренгейта");
                int fahrenheit = scn.nextInt();
                System.out.println(fahrenheit + " градусов Фаренгейта равно " + celsium2farenheit(fahrenheit) + " градусов Цельсия.");
                System.out.println("");
            }


        }

    }
}
