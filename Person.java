public class Person {
  
//  public static void main(String[] args) {
//       Person p = new Person("Emily", "Kitchen");
//       System.out.println("The name is " + p.getFirstName() + " " + p.getLastName());
//   }
  
  private String firstName;
  private String lastName;
  
  public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
  }
  
  public String getFirstName() {
      return firstName;
  }
  
  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }
  
  public String getLastName() {
      return lastName;
  }
  
  public void setLastName(String lastName) {
      this.lastName = lasttName;
  }
}
