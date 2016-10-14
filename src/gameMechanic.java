import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;


public class gameMechanic {

    public static int rand;
    public static String stateInsert;
    public static String stateUpdate;

    gameMechanic()throws SQLException{
        Random random=new Random();
        rand=random.nextInt(10);
       startGame(getUser(),rand);
    }

  static User getUser() throws SQLException{
      User user=new User();
      Scanner scanner=new Scanner(System.in);
      System.out.println("input excising name user:");
      String name=scanner.next();
      String query="select * from names where names='"+name+"'";
      try {
          workStatement workStatement = new workStatement();
          ResultSet resultSet = workStatement.getResultSet("SELECT * FROM names where names='"+name+"'");
          resultSet.next(); //без этой херни не работает

          user.setId(resultSet.getInt("idnames"));
          user.setNames(resultSet.getString("names"));
          System.out.println(name+" input namber:");
          user.setNumber(scanner.nextInt());              //(resultSet.getInt("numbers"));
          user.setWin(resultSet.getInt("win"));
          user.setFall(resultSet.getInt("fall"));

          System.out.println("before:"+user);
      } catch (SQLException e){
          e.printStackTrace();
      }
      System.out.println(user);
      return user;
  }
  static   String startGame(User user,int random){
        int win=0;
        int fall=0;
        int number=0;
        String queryInsert="";
        String queryUpdate="";
        number=user.getNumber();
        if (user.getNumber()==random){
            win+=user.getWin();
            System.out.println("winn");
        }
        else
        {
            fall+=user.getFall();
            System.out.println("fall");
        }
        queryInsert="INSERT INTO names (names, number, win, fall) VALUES ('"+user.getNames()
                +"', '"
                +number
                +"', '"
                +win
                +"', '"
                +fall+"')";
       queryUpdate="update names set number='"+number+"', win='"+win+"',fall='"+fall+"' where names='"+user.getNames()+"'";
      //System.out.println("all right:"+queryInsert);
        stateInsert=queryInsert;
        stateUpdate =queryUpdate;
        return queryInsert;//хз зачем, но пусть пока возвращает
    }


}