package JDBCdemo.ConnectingToDatabaseUsingProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MrHasansClassCodes {
    public static String filePath = "../Practice/SecretProperties/Secret.properties";
    public static Connection myCon = null;
    public static Statement myStatement = null;
    public static ResultSet resultSet = null;
    public static PreparedStatement preparedStatement = null;


    public static void main(String[] args) {
        MrHasansClassCodes.insertDataFromStringToSQLTable("Mahirul","tutoring_squad","frnd_LastName");
    }








    public static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }

    // Database Connection
    public static Connection connectToSQLDatabase() throws IOException, ClassNotFoundException, SQLException {
        Properties prop = MrHasansClassCodes.loadProperties(filePath);
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String user = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        myCon = DriverManager.getConnection(url, user, password);
        myStatement = myCon.createStatement();

        System.out.println("Database is Connected successfully");
        return myCon;
    }

    public static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (myStatement != null) {
                myStatement.close();
            }
            if (myCon != null) {
                myCon.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<>();
        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    private static List<String> getResultSetData(ResultSet resultSet, String columnName1, String columnName2) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while (resultSet.next()) {
            String itemName1 = resultSet.getString(columnName1);
            String itemName2 = resultSet.getString(columnName2);
            dataList.add(itemName1);
            dataList.add(itemName2);
        }
        return dataList;
    }

    public static List<String> readDatabase(String tableName, String columnName) {
        List<String> data = new ArrayList<>();
        try {
            MrHasansClassCodes.connectToSQLDatabase();
            myStatement = myCon.createStatement();
            resultSet = myStatement.executeQuery("select * from " + tableName);
            data = MrHasansClassCodes.getResultSetData(resultSet, columnName);
            for (String dt : data) {
                System.out.println(dt + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            MrHasansClassCodes.close();
        }
        return data;
    }

    public static void insertProfileToSqlTable(String tableName, String columnName1, String columnName2, String name, int num) {
        try {
            connectToSQLDatabase();
            preparedStatement = myCon.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1 + "," + columnName2 + " ) VALUES(?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, num);
            preparedStatement.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertDataFromStringToSQLTable(String data, String tableName, String columnName) {
        try {
            connectToSQLDatabase();
            preparedStatement = myCon.prepareStatement("Insert into " + tableName + " (" + columnName + ") values(?)");
            preparedStatement.setString(1, data);
            preparedStatement.executeUpdate();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (SQLException sq) {
            sq.printStackTrace();
        } catch (ClassNotFoundException cf) {
            cf.printStackTrace();
        }
    }
}
