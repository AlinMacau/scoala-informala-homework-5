import java.time.LocalDate;

/**
 * In this class I created a student with the requested atributes.
 * It has getters and setters and  setters and a toString method .
 */

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String ID;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
