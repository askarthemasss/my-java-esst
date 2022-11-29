import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        
        Properties p = new Properties();

        // create file - to store data - use OutputStream
        OutputStream os = new FileOutputStream("dataConfig.properties");

        // set properties
        p.setProperty("url", "localhost:8080");
        p.setProperty("uname", "askar");
        p.setProperty("pass", "1234");

        // store/create
        p.store(os, null);

        // To fetch data - use InputStream
        InputStream is = new FileInputStream("dataConfig.properties");
        // before start working with properties file, we need to load the file first
        // Load properties file - load all the data from properties file to p(Properties) object
        p.load(is);

        // getProperty
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("uname"));
        System.out.println(p.getProperty("pass"));

        // list all
        p.list(System.out);

    }
}
