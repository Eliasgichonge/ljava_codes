import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamTest {
    public static void main(String[] args) {
        
        try {
            byte bwrite [] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bwrite.length; x++) {
                os.write(bwrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char)is.read() + " ");
            }
            is.close();
        } catch (IOException e) {
              System.out.println("Exception");
        }
    }
}
