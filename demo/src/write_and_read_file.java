import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class write_and_read_file {
    public static void main (String args []){
        try(FileChannel file = (FileChannel) Files.newByteChannel(Paths.get("D:\\2\\demo.txt"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE)){
            MappedByteBuffer buf = file.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for(int i=0; i<26; i++)
            buf.put((byte)('A'+i));
        }catch(InvalidPathException e){System.out.println("Error way to file"+e);}
        catch(IOException e){System.out.println("Error input - output"+e);}

        try(FileChannel file = (FileChannel) Files.newByteChannel(Paths.get("D:\\2\\demo.txt"))){
            long fs = file.size();
            MappedByteBuffer buf = file.map(FileChannel.MapMode.READ_ONLY, 0, fs);//access can be: READ_ONLY, READ_WRITE, PRIVATE
            for(int i=0; i<fs; i++)
                System.out.print((char)buf.get());
        }catch(InvalidPathException e){System.out.println("Error way to file"+e);}
        catch(IOException e){System.out.println("Error input - output"+e);}
    }
}
