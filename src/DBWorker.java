import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;



public class DBWorker {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/names_bd";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";

    public Connection getConnection() {
        return connection;
    }

    private Connection connection;

    public DBWorker(){

        try{

            Driver driver=new FabricMySQLDriver();

            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
