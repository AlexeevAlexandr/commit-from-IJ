import java.io.File;

public class info_about_file {
    private static void p(String s) {
        System.out.println(s);
    }
    public static void main(String args []){
        File fl = new File("D:\\2\\demo.txt");
        p ("Name file: "+fl.getName());
        p ("Way to file: "+fl.getPath());
        p ("Absolutely way to file: "+fl.getAbsolutePath());
        p ("Parent directory: "+fl.getParent());
        p (fl.exists() ? "exists" : "not exists");
        p (fl.canWrite() ? "available to write" : "not available to write");
        p (fl.canRead() ? "available to read" : "not available to read");
        p (fl.isDirectory() ? "is catalog" : "not is catalog");
        p (fl.isFile() ? "is usual file" : "not is usual file");
        p (fl.isAbsolute() ? "is Absolutely " : "not is Absolutely");
        p ("last change in file: "+fl.lastModified());
        p ("Size: "+fl.length()+" byte");
    }
}
