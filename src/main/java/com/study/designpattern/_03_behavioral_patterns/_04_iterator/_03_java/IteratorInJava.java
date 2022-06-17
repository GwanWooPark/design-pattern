package com.study.designpattern._03_behavioral_patterns._04_iterator._03_java;

import com.study.designpattern._03_behavioral_patterns._04_iterator._02_after.Board;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorInJava {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        Enumeration enumeration;
        Iterator iterator;

        Board board = new Board();
        board.addPost("디자인 패턴");
        board.addPost("이터레이터 패턴 공부");
        board.addPost("패턴 적용 전");

        board.getPosts().iterator().forEachRemaining(p -> System.out.println(p.getTitle()));

        // 아래와 위의 차이
        // TODO StAX(Steaming API for XML): 콘솔 기반의 API, 이터레이터 기반의 API(XML을 읽고, 쓰기 가능)
        // TODO 아래는 XML을 읽는 이터레이터 API
//        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
//        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("Book.xml"));
//
//        while (reader.hasNext()) {
//            XMLEvent nextEvent = reader.nextEvent();
//
//            if (nextEvent.isStartElement()) {
//                StartElement startElement = nextEvent.asStartElement();
//                QName name = startElement.getName();
//                if (name.getLocalPart().equals("book")) {
//                    Attribute title = startElement.getAttributeByName(new QName("title"));
//                    System.out.println(title.getValue());
//                }
//
//            }
//        }




    }
}
