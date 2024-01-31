import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    @Test
    public void testGetFiles() {
        File testFile = new File("some-files");
        List<File> fileList = new ArrayList<>();
        fileList.add(new File("some-files\\a.txt"));
        fileList.add(new File("some-files\\even-more-files\\a.txt"));
        fileList.add(new File("some-files\\even-more-files\\d.java"));
        fileList.add(new File("some-files\\more-files\\b.txt"));
        fileList.add(new File("some-files\\more-files\\c.java"));

        try {
            List<File> files = FileExample.getFiles(testFile);
            assertEquals(fileList, files);
        } catch (IOException e) {
            System.out.println("wrong");
        }
    }
}
