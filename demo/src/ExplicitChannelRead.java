import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        try (SeekableByteChannel a = Files.newByteChannel(Paths.get("D:\\2\\demo1.txt"))){
            ByteBuffer q = ByteBuffer.allocate(128);//create memory for buffer
            do {
                count = a.read(q);//read data from file to buffer
                if (count != -1) {//break read data if buffer empty
                    q.rewind();   //prepare buffer for reading, rewind return position on beginning of buffer
                    for (int i=0; i<count; i++)//read data from buffer
                        System.out.print((char) q.get());//output data on display
                }
            } while (count != -1);
        }catch(InvalidPathException e) {System.out.println("Error way to file " + e);}
        catch (IOException e) {System.out.println("Error input - output " + e);}
    }
}