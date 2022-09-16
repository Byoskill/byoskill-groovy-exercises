import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.Files.*;

public class FileExample {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/formation/groovy/byoskill-groovy-exercises/chapter-working-with-groovy/exercise-csvreader/src/main/groovy/test.txt");
        String content = readString(Paths.get("/home/formation/groovy/byoskill-groovy-exercises/chapter-working-with-groovy/exercise-csvreader/src/main/groovy/test.txt"));
        String content2 = FileUtils.readFileToString(file, StandardCharsets.UTF_8);

        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(file));) {
            String str;
            while((str = br.readLine()) != null) {
                sb.append(str);
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());

    }
}
