package IO.IO_Pattern_bridge;

import java.io.*;
import java.util.Arrays;

/**
 * convert byte to char and conversely
 */
public class Pattern_bridge {
    public static void main(String[] args) throws IOException {
        byte[] data = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33};
        try(InputStream input = new ByteArrayInputStream(data);
        Reader reader = new InputStreamReader(input, "UTF-8"))
        {
            char[] buffer = new char[11];
            reader.read(buffer);
            System.out.println(buffer);
        }catch (IOException e) { e.printStackTrace(); }

        try(ByteArrayOutputStream output = new ByteArrayOutputStream();
            Writer writer = new OutputStreamWriter((OutputStream) output, "UTF-8"))
        {
            char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
            writer.write(chars);
            writer.flush();
            System.out.println(Arrays.toString(output.toByteArray()));
        }catch (IOException e) { e.printStackTrace(); }
    }
}
