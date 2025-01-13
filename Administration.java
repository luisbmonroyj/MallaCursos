import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Administration {

    private static String url = "jdbc:sqlite:bikelog.db";
    private static Scanner scanner = new Scanner(System.in);
    private String username = "username";
    private String password = "password";
      
    public static void main(String[] args){
      System.out.println("running");
       // Register the PostgreSQL driver
      
    }

       public static void insertTeacher(Teacher teacher){
    String insertString = "INSERT INTO teacher (id,name,lastname,email) VALUES ("+teacher.toInsertValues()+")";
  insertValues (insertString,false);
  }

    public static void insertCourse(Course curso){
    String insertString = "INSERT INTO course (name,description,duration,price,beginningDate,idTeacher) VALUES ("+curso.toInsertValues()+")";
  insertValues (insertString,false);
  }

  public static void insertValues (String query, boolean echo){
    Class.forName("org.postgresql.Driver");
    try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password){
      Statement statement = connection.createStatement();
      statement.executeUpdate(query);
      }
    catch(SQLException e) {
        e.printStackTrace(System.err); 
        if (echo) //checking valiidity of query in case of errror
          System.out.println(query);
      }
    connection.close();
    }
  }
  
    

}
