import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Test014 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("/Users/gaoyunhu/2.txt");
        List<String> fc = Files.readAllLines(file);
        fc.stream().forEach (s -> System.out.println(s));
//        Stream<String> fc = Files.lines(file);
//        fc.forEach (s -> System.out.println(s));d
    }
}
