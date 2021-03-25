package JDBCdemo.ConnectingToDatabaseUsingProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectionAndDisplayingUsingProperties {
    static String propertyPath = "../Practice/SecretProperties/Secret.properties";

    public static void main(String[] args) {
    connectionAndDisplaying("tutoring_squad","frndId","frnd_FirstName","frnd_LastName","frnd_Salary");
    }

    public static void connectionAndDisplaying(String tableName,String column,String column1, String column2, String column3){
        Connection myCon = null;
        try {
            FileInputStream inputStream = new FileInputStream(propertyPath);
            Properties prop = new Properties();
            prop.load(inputStream);
            String driverClass = prop.getProperty("MYSQLJDBC.driver");
            String url = prop.getProperty("MYSQLJDBC.url");
            String user = prop.getProperty("MYSQLJDBC.userName");
            String password = prop.getProperty("MYSQLJDBC.password");
            Class.forName(driverClass);
            myCon = DriverManager.getConnection(url,user,password);
            Statement myStatement= myCon.createStatement();
            ResultSet results = myStatement.executeQuery("Select * From "+ tableName);
            while(results.next()){
                System.out.println(results.getString(column)+" , "+results.getString(column1)
                        +" , "+results.getString(column2)+" , "+results.getString(column3));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}

