package com.ajit;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser{
    public static void main(String[] args) {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document document= builder.parse(new File("C:\\Users\\agokaraj\\Desktop\\GIT\\DSA-Bootcamp-Java\\MyLearning\\Assignments\\FlowOfProgram\\src\\com\\ajit\\OpportunityTeamMemberDeleteHistory.xml"));
            document.getDocumentElement().normalize();

            NodeList columnList=document.getElementsByTagName("column");
            for(int i=0;i<columnList.getLength();i++){
                Node column=columnList.item(i);
                if(column.getNodeType()==Node.ELEMENT_NODE){
                    Element columnElement=(Element)column;
                    
                    String colname=columnElement.getAttribute("originalDbColumnName");
                    String len=columnElement.getAttribute("length");
                    String nullable=columnElement.getAttribute("nullable");
                    String type=columnType(columnElement.getAttribute("talendType"),len,colname,nullable);
                    String comma_no_comma=(columnList.getLength()-i==1)?"":",";
                    
                    System.out.println(colname
                    +
                    ' '
                    +type+comma_no_comma);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static String columnType(String str,String length, String colname,String nullable){
        str=str.replace("id_", "");
        if(colname.equals("LastModifiedDate")||colname.equals("SystemModstamp")||colname.equals("CreatedDate")){
            str= "TIMESTAMP WITH LOCAL TIME ZONE";
        }
        
        if(str.equals("String")){
            str= "varchar2("+length+")";
        }
        
        if(str.equals("Boolean")){
            str="varchar2(1)";
        }
        if(nullable.equals("false")){
            str=str+" not null";
        }
        //System.out.println(nullable);
        return str;
    }
}