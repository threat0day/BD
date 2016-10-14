import java.sql.*;

public class main {

    public static void main(String[] args) throws SQLException {
       gameMechanic GM=new gameMechanic();
        workStatement workStatement=new workStatement();
        workStatement.executeStatement(gameMechanic.stateUpdate);
    }

}
