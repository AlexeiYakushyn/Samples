package lesson_16;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by java2 on 28.08.17.
 */
public class RVDomParser {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File inputFile = new File("/home/java2/IdeaProjects/Samples/lessons/src/lesson_16/vehicles.xml");

        DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFact.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        NodeList nodes = doc.getElementsByTagName("rv");
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.hasAttributes()) {
                Node id = node.getAttributes().getNamedItem("id");
               // Node manufacturer = node.getAttributes().getNamedItem("manufacturer"); - for elements only, not for tags;
                System.out.println(id);
            }

            NodeList children = node.getChildNodes();
            for (int j = 0; j < children.getLength(); j++) {
                Node child = children.item(j);
                //System.out.println(child.getTextContent());
                if (child.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(child.getNodeName() + ": " + child.getTextContent());
                }
            }
        }
    }
}
