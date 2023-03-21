import java.io.*;

public class fileCreate {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 11; i++) {
            File newFile = new File("LambdaExpressionExample"+i+".java");
            newFile.createNewFile();
        }
    }
}
