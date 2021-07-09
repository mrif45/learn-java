import java.io.FileInputStream;
import java.io.IOException;

public  class ReadText {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        fileInput = new FileInputStream("survei.txt");
        int data = fileInput.read();
        while(data != -1 ){
            System.out.print((char)data);
            data = fileInput.read();
        }
        fileInput.close();
    }
}