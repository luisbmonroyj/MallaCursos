import java.math.BigInteger;

public class Teacher{

    private BigInteger id;
    private String name;
    private String lastname;
    private String email;
  //void constructor
  public Teacher () {
    
  }

  @constructor
  public Teacher (BigInteger id,    String name,    String lastname,    String email) {
    this. id  = id;
    this.name = name;
    this.lastname = lastname;
    this.email = email;
  //
  }

  @getters
  public BigInteger getId (){
    return this.id;
  }
public String getName (){
    return this.name;
  }
public String getLastname (){
    return this.lastname;
  }
public BigInteger getEmail (){
    return this.email;
  }

  @setters
  public void setId(BigInteger id){
    this. id  = id;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setLastName(String name){
    this.lastname = lastname;
  }
  public void setEmail(String email){
    this.email = email;
  }

  public String toInsertValues (){
    return BigInteger.toString(this.id)+"'"+this.name+"','"+this.lastname+"','"+this.email+"'";
  }

  
} 
