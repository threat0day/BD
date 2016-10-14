import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class workStatement {
    private int id;
    private String names;
    private int number;
    private int win;
    private int fall;

    public  static DBWorker worker=new DBWorker();
    public static Statement stmt;

    workStatement()throws SQLException {
        stmt =null;
        stmt = worker.getConnection().createStatement();
    }

    void executeStatement(String query) throws SQLException{

       try{
           stmt.execute(query);// here query
       } finally {
           if (stmt != null) {
               stmt.close();
           }
       }
   }
  public  ResultSet getResultSet(String query) throws SQLException{
        ResultSet resultSet=stmt.executeQuery(query);

        return resultSet;
    }


}
