import java.io.IOException;

public interface WorkingWithData {
    void DoShift(String dataSource, int key, boolean needWriteInFile, String writeToFile, boolean needToReadFromFile, String fileToRead) throws IOException;
    void DoUnicode(String dataSource, int key, boolean needWriteInFile, String writeToFile, boolean needToReadFromFile, String fileToRead) throws IOException;
}
