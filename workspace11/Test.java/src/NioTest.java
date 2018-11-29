import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Paths.get("D:\\abc.txt");
		
		System.out.println(path.getNameCount());
		System.out.println("absolute: "+path.isAbsolute());
		System.out.println("file name: "+path.getFileName());
		System.out.println("root path: "+path.getRoot());
		System.out.println("parent path: "+path.getParent());
		
		
	}

}
