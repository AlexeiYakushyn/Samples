package lesson_17;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by java2 on 31.08.17.
 */
public class JSONParsers {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("/home/java2/IdeaProjects/Samples/lessons/src/lesson_17/jsonVehicles.json"));
            System.out.println(jsonObject);

        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }
}
