package JDBCdemo.ConnectingToDatabaseUsingProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUsingProperties {

    static String propertyPath = "../Practice/SecretProperties/Secret.properties";

    public static void main(String[] args) {

        MySQLJDBCUtil();
    }



    public static void MySQLJDBCUtil(){
        Connection mycon = null;
        try {
            //Properties prop = new Properties();
            //prop.load(new FileInputStream("Secret.properties");


            FileInputStream inputStream = new FileInputStream(propertyPath);// passing the path of the file where i am getting the info
            Properties prop = new Properties();//use the Property class so that we can load the properties from the secret.properties file
            prop.load(inputStream);//loading the file--> go to the path and load the file
            //get details
            String driverClass = prop.getProperty("MYSQLJDBC.driver");
            String url = prop.getProperty("MYSQLJDBC.url");
            String user = prop.getProperty("MYSQLJDBC.userName");
            String password = prop.getProperty("MYSQLJDBC.password");
            //The most common approach to register a driver is to use
            // Java's Class.forName() method, to dynamically load the driver's class
            // file into memory, which automatically registers it.
            // This method is preferable because it allows you to
            // make the driver registration configurable and portable.
            Class.forName(driverClass);//register the driver
            mycon = DriverManager.getConnection(url,user,password);
            System.out.println("Connection success!!!!");
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {//it is required explicitly to close all the connections to the database to end each database session.
            // However, if you forget, Java's garbage collector will close the connection when it cleans up stale objects.
            try {
                if(mycon !=null)
                mycon.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
//