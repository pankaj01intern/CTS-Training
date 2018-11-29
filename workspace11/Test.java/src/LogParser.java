import java.util.Collection;
import java.util.List;

import org.w3c.dom.NodeList;

public class LogParser {
	public static Collection<Integer> getIdsByMessage(String xml, String message) throws Exception {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) throws Exception {
        String xml = 
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<log>\n" + 
                "    <entry id=\"1\">\n" + 
                "        <message>Application started</message>\n" + 
                "    </entry>\n" + 
                "    <entry id=\"2\">\n" + 
                "        <message>Application ended</message>\n" + 
                "    </entry>\n" + 
                "</log>";
        
       /* List<String> Result = new List<String>();

        System.Xml.Linq.XDocument XmlDoc = System.Xml.Linq.XDocument.Parse(xml);

        foreach (var element in XmlDoc.Descendants().Attributes("name").ToList())
        {
            if (element.Value.Contains(message))
                Result.Add(element.Value);
            
            //   Console.WriteLine(name);

        }
        return Result;
        // throw new NotImplementedException("Waiting to be implemented.");
    } */
        
        Collection<Integer> ids = getIdsByMessage(xml, "Application ended");
        for(int id: ids)
        	if (element.Value.Contains(message))
                Result.Add(element.Value);
            System.out.println(id);
    }
}
