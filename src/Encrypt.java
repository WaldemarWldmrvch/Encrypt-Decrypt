import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encrypt implements WorkingWithData {
    @Override
    public void DoShift(String dataSource, int key, boolean needWriteInFile, String writeToFile, boolean needToReadFromFile, String fileToRead) throws IOException {
        String result = "";
        if (needToReadFromFile == true) {
            File file = new File("./" + fileToRead);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                dataSource = scanner.nextLine();
            }
            scanner.close();
        }
        for (int i = 0; i < dataSource.length(); i++) {
            if ((dataSource.charAt(i) >= 65 && dataSource.charAt(i) <= 90) && (dataSource.charAt(i) + key > 90)) {
                result += (char) (dataSource.charAt(i) + key - 90 + 65 - 1);
            } else if (dataSource.charAt(i) >= 65 && dataSource.charAt(i) <= 90 && (dataSource.charAt(i) + key <= 90)) {
                result += (char) (dataSource.charAt(i) + key);
            } else if (dataSource.charAt(i) >= 97 && dataSource.charAt(i) <= 122 && (dataSource.charAt(i) + key > 122)) {
                result += (char) (dataSource.charAt(i) + key - 122 + 97 - 1);
            } else if (dataSource.charAt(i) >= 97 && dataSource.charAt(i) <= 122 && (dataSource.charAt(i) + key <= 122)) {
                result += (char) (dataSource.charAt(i) + key);
            } else {
                result += dataSource.charAt(i);
            }
        }
        if (needWriteInFile == false) {
            System.out.println(result);
        } else {
            File file = new File("./" + writeToFile);
            FileWriter writer = new FileWriter(file);
            writer.write(result);
            writer.close();
        }
    }


    @Override
    public void DoUnicode(String dataSource, int key, boolean needWriteInFile, String writeToFile, boolean needToReadFromFile, String fileToRead) throws IOException {
        String result = "";
        if (needToReadFromFile == true) {
            File file = new File("./" + fileToRead);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                dataSource = scanner.nextLine();
            }
            scanner.close();
        }
        for (int i = 0; i < dataSource.length(); i++) {
            result += (char) (dataSource.charAt(i) + key);
        }
        if (needWriteInFile == false) {
            System.out.println(result);
        } else {
            File file = new File("./" + writeToFile);
            FileWriter writer = new FileWriter(file);
            writer.write(result);
            writer.close();
        }

    }
}
