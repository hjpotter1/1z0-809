import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test024 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/software/././sys/readme.txt") ;
        Path path2 = path1.normalize() ;
        Path path3 =path2.relativize(path1);
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
        System.out.println(path1.getNameCount());///software/././sys/readme.txt
        System.out.println(path2.getNameCount());///software/sys/readme.txt
        System.out.println(path3.getNameCount());//../../././sys/readme.txt
    }
}


