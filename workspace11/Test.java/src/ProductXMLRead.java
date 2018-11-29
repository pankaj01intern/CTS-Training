import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ProductXMLRead {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance(); 
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document dom=builder.parse("Product.xml");
		
		NodeList nodelist=dom.getElementsByTagName("Products");
		
		for(int i=0;i<nodelist.getLength();i++){
			NodeList nodelist2=nodelist.item(i).getChildNodes();
			
			for(int j=0;j<nodelist2.getLength();j++){
				NodeList nodelist3=nodelist2.item(j).getChildNodes();
				for(int k=0;k<nodelist3.getLength();k++){
					NodeList nodelist4=nodelist3.item(k).getChildNodes();
				for(int l=0;l<nodelist4.getLength();l++){
					if(nodelist4.item(l).getNodeType()==Node.TEXT_NODE)
						System.out.println(nodelist4.item(l).getNodeValue()+" ");
				}
			}
				System.out.println();
		}
		
			
		

	}

}
}
