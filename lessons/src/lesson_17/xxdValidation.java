package lesson_17;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by java2 on 31.08.17.
 */
public class xxdValidation {

    public static void main(String[] args) {

        try {
            URL schema = new URL("file:/home/java2/IdeaProjects/Samples/lessons/src/lesson_16/vehicles.xml");
            Source xmlFile = new StreamSource(new File("/home/java2/IdeaProjects/Samples/lessons/src/lesson_16/vehicles.xml"));
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema1 = schemaFactory.newSchema();

            Validator validator = schema1.newValidator();
            validator.validate(xmlFile);



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
