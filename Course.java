import java.sql.Timestamp;

public class Course {

  private String name;
  private String description;
  private int duration;
  private double price;
  private TimeStamp beginningDate;
  private BigInteger idTeacher;

  
  public Course(){
    
  }  

  public Course(String name,String description,int duration,double price,TimeStamp beginningDate,BigInteger idTeacher){
    this.name = name;
    this.description = description;
    this.duration = duration; 
    this.price = price;
    this.beginningDate = beginningDate;
    this.idTeacher= idTeacher;
  }  

  @getters
  public String getName (){
    return this.name; 
  }
  public String getDescription (){
    return this.name; 
  }
  public int getDuration (){
    return this.duration; 
  }
  public double getPrice (){
    return this.price; 
  }
  public TimeStamp getBeginningDate (){
    return this.beginningDate; 
  }
  public BigInteger getIdTeacher (){
    return this.idTeacher; 
  }

  @setters
  public void setName(String name){
    this.name = name;
  }
  public void setDescription (String description){
    
    this.description = description;
    
  }
  public void setDuration (int duration){
    this.duration = duration; 
    
  }
  public void setPrice (double price){
    this.price = price;
  }
  public void setBeginningDate (TimeStamp beginningDate){
    this.beginningDate = beginningDate;
  }
  public void setIDTeacher (BigInteger idTeacher){
    this.idTeacher= idTeacher;
  }

  public String toInsertValues(){
    return "'"+this.name+"','"+this.description+"',"+Integer.toString(this.duration)+","+
      Double.toInteger(this.price)+",'"+beginningDate.toString+"',"+BigInteger.toString(this.idTeacher);
    
  }

  public String toUpdateValues(){
   return "name = '"+this.name+"', description = '"+this.description+"', duration = "+Integer.toString(this.duration)+", price"+
      Double.toInteger(this.price)+",beginningDate = '"+beginningDate.toString+"', idTeacher = "+BigInteger.toString(this.idTeacher);
   }
  
}
