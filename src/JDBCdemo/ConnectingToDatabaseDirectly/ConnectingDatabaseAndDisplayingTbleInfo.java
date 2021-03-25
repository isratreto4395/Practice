package JDBCdemo.ConnectingToDatabaseDirectly;
import java.sql.*; //. * means it will include all the classes under SQL
public class ConnectingDatabaseAndDisplayingTbleInfo {
    public static void main(String[] args) {

        try{
            //1. get a connection to database
            //connection class is connecting my code to the database
            //DriverManager- provides the utilities to connect the dataa- i need some kind of driver to connect my codes to the mySQL database
            //jdbc.mySQL is the url
            //localhost means my ip address
            //3306 is my database port number
            // then input the databse name - i used wea_selenium_ny_fall2021
            //I created a employee2demo table inside the database wea_...
            // then input username and password for the connection

           Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021", "root","Monika199%");

            System.out.println("database connected...."); // first step- make sure connection set successfully

            //2. create a statement
            //statement class - i am going to use this class to call my statements in mySQL
            // myCon.createStatement()- this is one of the methods to create the statements
            Statement myStatement = myCon.createStatement();
            //3. execute SQL query
            //resultset- means collection of my table data
            //getresultset - get my statements and store it in resultset
            ResultSet myResult = myStatement.executeQuery("select * from employees2demo");

            //4. process the result set
            while(myResult.next()){
                System.out.println(myResult.getString("last_name")+", "+myResult.getString("first_name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
