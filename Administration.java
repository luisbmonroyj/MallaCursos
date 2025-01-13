import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Administration {

    private static String url = "jdbc:postgresql://localhost:5432/malla"";
    private static Scanner scanner = new Scanner(System.in);
    private String username = "username";
    private String password = "password";
      
    public static void main(String[] args){
      System.out.println("running");
       // Register the PostgreSQL driver
    }
    
@create
public static void insertTeacher(Teacher teacher){
    String insertString = "INSERT INTO teacher (id,name,lastname,email) VALUES ("+teacher.toInsertValues()+")";
  execute (insertString,false);
  }

public static void insertCourse(Course curso){
    String insertString = "INSERT INTO course (name,description,duration,price,beginningDate,idTeacher) VALUES ("+curso.toInsertValues()+")";
  execute (insertString,false);
  }
    
public static void execute (String query, boolean echo){
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


@read
public static Teacher[] teachers (String where) {
        int counter = 0;
        Teacher[] profesores = new Teacher[getRowCount("teacher "+where,false)];
        // create a database connection
        try (Connection connection = DriverManager.getConnection(url);){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM teacher "+where);
            while(rs.next()) {
                BigInteger id = rs.getInt("id");
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                profesores[counter] = new Course(name,description,duration,price,beginningDate,idTeacher);  
                counter++;
            }
            sqliteConnection.close();
        }
        catch(SQLException e)
            {e.printStackTrace(System.err); }
     
    return profesores;
    }

public static course[] courses (String where) {
        int counter = 0;
        Course[] cursos = new Course[getRowCount("course "+where,false)];
        // create a database connection
        try (Connection connection = DriverManager.getConnection(url);){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM course "+where);
            while(rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                int duration = rs.getInt("duration"); 
                double price = rs.getDouble("price");
                TimeStamp beginningDate = rs.getTimeStamp("beginningDate");
                BigInteger idTeacher = rs.getInt("idTeacher);
                cursos[counter] = new Course(name,description,duration,price,beginningDate,idTeacher);  
                counter++;
            }
            sqliteConnection.close();
        }
        catch(SQLException e)
            {e.printStackTrace(System.err); }
     
    return cursos;
    }

public static int getRowCount (String table, boolean orderByDate) {
        //this method helps create the object array in perfect length
        String queryString = "SELECT * FROM "+table;
        if (orderByDate)
            queryString += " ORDER BY date";
        // create a database connection
        try (Connection sqliteConnection = DriverManager.getConnection(url);){
            Statement statement = sqliteConnection.createStatement();
            ResultSet rs = statement.executeQuery(queryString);
            while(rs.next())
                counter++;
            sqliteConnection.close();
        }
        catch(SQLException e)
            {e.printStackTrace(System.err); }
        
    return counter;
}

@update
public static void updateTeacher(Teacher teacher){
    String updateString = "UPDATE teacher SET "+teacher.toUpdateValues();
  execute (updateString,false);
  }

public static void updateCourse(Course curso){
    String updateString = "UPDATE course SET "+curso.toUpdateValues();
  execute (updateString,false);
  }

@delete
public static void deleteCourse (Course course){
    //NAME is unique so this is enough
    String deleteString = "DELETE FROM course WHERE name = '"+course.getName()+"'";
    execute (deleteString,false);
}
public static void deleteTeacher (Teacher professor){
    //id is unique in PK so this is enough
    String deleteString = "DELETE FROM teacher WHERE id = "+professor.getId();
    execute (deleteString,false);
}     

}
