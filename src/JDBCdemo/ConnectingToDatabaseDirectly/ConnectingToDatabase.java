package JDBCdemo.ConnectingToDatabaseDirectly;

import java.sql.*;

public class ConnectingToDatabase {
    static String url ="jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021";
    static String userName="root";
    static String password= "Monika199%";

    public static void main(String[] args) throws SQLException {
        connection(url,userName,password,"Select * From tutoring_squad;");

    }
    public static void connection(String url, String userName, String password, String query) throws SQLException {
        //1. get a connection to your database
        Connection myCon = DriverManager.getConnection(url,userName,password);
        System.out.println("database connection is successful");

        //2. create a statement
        Statement myStatement = myCon.createStatement();

        //3. execute the sql query
        //ResultSet results1 = myStatement.executeQuery("Select * From tutoring_squad");
        ResultSet results = myStatement.executeQuery(query);
        System.out.println(results);
        //4. process the result set
//        while(results.next()){
//            System.out.println(results.getString());
//            }
//        }


    }





}


    //INSERT INTO `wea_selenium_ny_fall2021`.`tutoring_squad` (`frndID`, `frnd_FirstName`, `frnd_LastName`, `frnd_Salary`, `frnd_Email`) VALUES ('103', 'Easha', 'Khanam', '247000', 'blah3@gmail.com');
