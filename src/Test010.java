import org.w3c.dom.ls.LSOutput;
import sun.lwawt.macosx.CSystemTray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test010 {
    public static void main(String[] args) {
        Stream<Path> paths = Stream.of(Paths.get("data.doc"),
                Paths.get("data.txt"),
                Paths.get("data.xml"));
        paths.filter(s -> s.toString().endsWith("txt")).forEach(
                s -> {
                    try {
                        Files.readAllLines(s)
                                .stream()
                                .forEach(System.out::println); //line n1
                        System.out.println();
                    } catch (IOException e) {
                        System.out.println("Exception");
                    }
                });
    }
}
