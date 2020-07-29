package test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Test156 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("第一行");
        list.add("第二行");
        list.add("第三行");
        Path path = Paths.get("/Users/gaoyunhu/2.txt");
        Files.write(path, list, StandardOpenOption.APPEND);
    }

}
