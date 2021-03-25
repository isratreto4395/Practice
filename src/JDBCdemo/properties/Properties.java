package JDBCdemo.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Properties {
    public static void main(String[] args) {

    }



    public static Properties createPropertiesFile() throws FileNotFoundException {
        Properties mrProp = new Properties();
        FileOutputStream outputStream = new FileOutputStream("myNewSecretFiles.properties");
        return mrProp;
    }







}
