package base.day16_XML与JSON.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3DomDriver;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/13 17:19
 * @Description XMLDemo
 */
public class XMLDemo {
    /**
     * SAX解析的特点：
     * 1.基于事件驱动
     * 2.顺序读取，速度快
     * 3.不能任意读取节点（灵活性差）
     * 4.解析时占用的内存小
     * 5.SAX更适用于在性能要求更高的设备上使用（Android开发中）
     *
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    @Test
    public void saxParseXML() throws ParserConfigurationException, SAXException, IOException {
        // 1.创建一个SAX解析器工厂对象
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        // 2.通过工厂对象创建一个SAX解析器
        SAXParser saxParser = saxParserFactory.newSAXParser();
        // 3.创建一个数据处理器（需要我们自己来编写）
        PersonHandler personHandler = new PersonHandler();
        // 4.开始解析
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("day16_XML与JSON/xml/person.xml");
        saxParser.parse(is, personHandler);
        List<Person> persons = personHandler.getPersons();
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    /**
     * DOM解析XML
     * 1.基于属性结构，通过解析器一次性把文档加载到内存中，所以比较占用内存，可以随机访问，更加灵活，更适合在web开发中使用
     *
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    @Test
    public void domParseXML() throws ParserConfigurationException, IOException, SAXException {
        // 1.创建一个DOM解析器工厂对象
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 2.通过工厂对象生成解析器对象
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        // 3.解析文档
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("day16_XML与JSON/xml/person.xml");
        // 此代码完成后， 整个XML文档已经被加载到内存中，以树状形式存储
        Document doc = documentBuilder.parse(is);
        // 4.从内存中读取数据
        // 获取节点名称为person的所有节点，返回节点集合
        NodeList personNodeList = doc.getElementsByTagName("person");
        ArrayList<Person> persons = new ArrayList<>();
        Person person = null;
        // 此循环迭代两次
        for (int i = 0; i < personNodeList.getLength(); i++) {
            Node personNode = personNodeList.item(i);
            person = new Person();
            // 获取节点的属性值
            String personid = personNode.getAttributes().getNamedItem("personid").getNodeValue();
            person.setPersonId(personid);
            // 获取当前节点的所有子节点
            NodeList childNodes = personNode.getChildNodes();
            for (int j = 0; j < childNodes.getLength(); j++) {
                Node item = childNodes.item(j);
                String nodeName = item.getNodeName();
                if ("name".equals(nodeName)) {
                    person.setName(item.getFirstChild().getNodeValue());
                } else if ("address".equals(nodeName)) {
                    person.setAddress(item.getFirstChild().getNodeValue());
                } else if ("tel".equals(nodeName)) {
                    person.setTel(item.getFirstChild().getNodeValue());
                } else if ("fax".equals(nodeName)) {
                    person.setFax(item.getFirstChild().getNodeValue());
                } else if ("email".equals(nodeName)) {
                    person.setEmail(item.getFirstChild().getNodeValue());
                }
            }
            persons.add(person);
        }
        System.out.println("结果：");
        System.out.println(Arrays.toString(persons.toArray()));
    }

    /**
     * JDOM解析XML
     * 1.与DOM类似基于树形结构
     * 2.与DOM的区别：
     * （1）第三方开源的组件
     * （2）实现使用JAVA的Collections接口
     * （3）效率比DOM更快
     *
     * @throws JDOMException
     * @throws IOException
     */
    @Test
    public void jdomParseXML() throws JDOMException, IOException {
        // 创建JDOM解析器
        SAXBuilder builder = new SAXBuilder();
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("day16_XML与JSON/xml/person.xml");
        org.jdom2.Document build = builder.build(is);
        Element rootElement = build.getRootElement();
        List<Person> list = new ArrayList<>();
        Person person = null;
        List<Element> children = rootElement.getChildren();
        for (Element child : children) {
            person = new Person();
            String personid = child.getAttributeValue("personid");
            person.setPersonId(personid);
            List<Element> children1 = child.getChildren();
            for (Element element : children1) {
                String name = element.getName();
                if ("name".equals(name)) {
                    person.setName(element.getText());
                } else if ("address".equals(name)) {
                    person.setAddress(element.getText());
                } else if ("tel".equals(name)) {
                    person.setTel(element.getText());
                } else if ("fax".equals(name)) {
                    person.setFax(element.getText());
                } else if ("email".equals(name)) {
                    person.setEmail(element.getText());
                }
            }
            list.add(person);
        }
        System.out.println("结果：");
        System.out.println(Arrays.toString(list.toArray()));
    }

    /**
     * DOM4J解析XML
     * 1.基于树形结构，第三方组件
     * 2.解析速度快，效率更高，使用Java中的迭代器实现数据读取，在web框架中使用较多（Hibernate）
     *
     * @throws DocumentException
     */
    @Test
    public void dom4jParseXML() throws DocumentException {
        // 1.创建DOM4J的解析器结果
        SAXReader reader = new SAXReader();
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("day16_XML与JSON/xml/person.xml");
        org.dom4j.Document doc = reader.read(is);
        org.dom4j.Element rootElement = doc.getRootElement();
        Iterator<org.dom4j.Element> iterator = rootElement.elementIterator();
        List<Person> persons = new ArrayList<>();
        Person person = null;
        while (iterator.hasNext()) {
            person = new Person();
            org.dom4j.Element element = iterator.next();
            String personid = element.attributeValue("personid");
            person.setPersonId(personid);
            Iterator<org.dom4j.Element> iterator1 = element.elementIterator();
            while (iterator1.hasNext()) {
                org.dom4j.Element next = iterator1.next();
                String name = next.getName();
                if ("name".equals(name)) {
                    person.setName(next.getText());
                } else if ("address".equals(name)) {
                    person.setAddress(next.getText());
                } else if ("tel".equals(name)) {
                    person.setTel(next.getText());
                } else if ("fax".equals(name)) {
                    person.setFax(next.getText());
                } else if ("email".equals(name)) {
                    person.setEmail(next.getText());
                }
            }
            persons.add(person);
        }
        System.out.println("结果：");
        System.out.println(Arrays.toString(persons.toArray()));
    }

    /**
     * 把对象写入XML文件
     *
     * @throws FileNotFoundException
     */
    @Test
    public void xmlEnCoder() throws FileNotFoundException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/day16_XML与JSON/xml/test.xml"));
        XMLEncoder xmlEncoder = new XMLEncoder(bos);
        Person person = new Person();
        person.setPersonId("1212");
        person.setName("89");
        person.setAddress("北京");
        person.setTel("13838389723");
        person.setFax("6768789798");
        person.setEmail("vince@163.com");
        xmlEncoder.writeObject(person);
        xmlEncoder.close();
    }

    /**
     * 从XML文件中读取对象
     *
     * @throws FileNotFoundException
     */
    @Test
    public void xmlDeCoder() throws FileNotFoundException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/day16_XML与JSON/xml/test.xml"));
        XMLDecoder xmlDecoder = new XMLDecoder(bis);
        Person person = (Person) xmlDecoder.readObject();
        System.out.println(person);
    }

    /**
     * 使用第三方xstream组件实现XML的解析与生成
     */
    @Test
    public void xStream() {
        Person person = new Person();
        person.setPersonId("123");
        person.setName("812");
        person.setAddress("西安");
        person.setTel("320392094");
        person.setFax("3348092844");
        person.setEmail("faf@163.com");
        XStream xStream = new XStream(new Xpp3DomDriver());
        xStream.alias("person", Person.class);
        xStream.useAttributeFor(Person.class, "personId");
        String xml = xStream.toXML(person);
        System.out.println(xml);

        // 解析
        Person p = (Person) xStream.fromXML(xml);
        System.out.println(p);
    }
}
