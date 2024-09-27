
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
    public class Person {
   private String firstName;
   private String lastName;
   public Person(String fName, String lName) {
       firstName = fName;
       lastName = lName;
   }
public String getFirstName() {
    return firstName;
}
public void setFirstName(String fName) {
    firstName = fName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lName) {
    lastName = lName;
}
}

