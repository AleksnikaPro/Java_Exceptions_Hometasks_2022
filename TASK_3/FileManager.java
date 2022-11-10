package TASK_3;

import java.io.FileWriter;
import java.io.IOException;
public class FileManager {
    public FileManager() {
    }
    public void writeInfoIntoFile(String result) throws IOException {

        String[] splittedElements = result.split(" ");

        try (FileWriter writer = new FileWriter(splittedElements[0] + ".txt", true)) {
            writer.write(result);
            writer.append("\n");
            writer.flush();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }
}

