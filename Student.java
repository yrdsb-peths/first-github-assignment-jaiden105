public class Student {
  private String firstName;
  private String lastName;
  private int gradeLevel;
  private int volunteerHours;
 
  public Student(String firstName, String lastName, int gradeLevel, int volunteerHours)
    this.firstName = firstName;    
    this.lastName = lastName;  
    this.gradeLevel = gradeLevel;  
    this.volunteerHours = volunteerHours;  
  
  }

  public String toString() {
    return firstName + " " + lastName + " is in " + gradeLevel + " and has " + volunteerHours + " volunteer hours";
    
  }

  
}
