import javax.naming.InvalidNameException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.zip.DataFormatException;

/**
 * In this class I created a repository of students, with the requested methods and validations for each one of them.
 */

public class Repository {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String ID;


    public Repository() {
    }

    public List<Student> studentList = new ArrayList<>();

    /**
     *
     * @param firstName keeps student's first name. Throws an exception if it is empty.
     * @param lastName keeps student's last name. Throws an exception if it is empty.
     * @param dateOfBirth keeps student's birth  date. Throws an exception if the age is less than 18 or greater than 120.
     * @param gender keeps the student's gender. Only four inputs accepted.
     * @param ID keeps the student's CNP. cannot be empty.
     *
     *
     * @throws InvalidNameException if first or second name is empty.
     * @throws DataFormatException if the age is less than 18 or greater tha 120.
     * @throws InputMismatchException if id is empty or does not exist.
     * @throws ParseException thrown by Collections.sort.
     */
    public void addStudents(String firstName, String lastName, String dateOfBirth, String gender, String ID) throws InvalidNameException, DataFormatException, InputMismatchException, ParseException {

        if (firstName.isEmpty()) {
            throw new InvalidNameException("The first name cannot be empty");
        }
        this.firstName = firstName;

        if (lastName.isEmpty()) {
            throw new InvalidNameException("The last name cannot be empty");
        }
        this.lastName = lastName;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dateOfBirth, dtf);
        if (localDate.getYear() < 1900) {
            throw new DataFormatException("The age cannot be greater than 120");
        }
        if (Period.between(localDate, LocalDate.now()).getYears() < 18) {
            throw new DataFormatException("The age cannot be less than 18");
        }
        this.dateOfBirth = localDate;

        switch (gender) {
            case "f":
                this.gender = "female";
                break;
            case "F":
                this.gender = "female";
                break;
            case "m":
                this.gender = "male";
                break;
            case "M":
                this.gender = "male";
                break;
            default:
                throw new InputMismatchException("The gender can only be male of female");
        }

        if (ID.isEmpty()) {
            throw new InputMismatchException("The ID cannot be empty");
        }
        this.ID = ID;
        Student x = new Student(this.firstName, this.lastName, this.dateOfBirth, this.gender, this.ID);
        studentList.add(x);
    }

    /**
     * Deletes a student by ID.
     * @param deleteID
     * @throws InputMismatchException
     */
    public void deleteStudents(String deleteID) throws InputMismatchException {////exception to make for student does not exist
        if (deleteID.isEmpty()) {
            throw new InputMismatchException("The ID cannot be empty");

        } else {
            Iterator<Student> iter = studentList.iterator();
            while (iter.hasNext()) {
                Student s = iter.next();
                if (s.getID().equals(deleteID))
                    iter.remove();
                else {
                    throw new InputMismatchException("The ID does not exist");
                }
            }
        }
    }

    /**
     * Sort all students by name or birth date
     * @param criteria
     * @throws InputMismatchException
     */
    public void listBy(String criteria) throws InputMismatchException {
        if (criteria.equals("name")) {
            Comparator<Student> StuNameComparator = new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    String StudentName1 = s1.getLastName().toUpperCase();
                    String StudentName2 = s2.getLastName().toUpperCase();
                    return StudentName1.compareTo(StudentName2);
                }
            };
            System.out.println("Student name Sorting:");
            Collections.sort(studentList, StuNameComparator);

            List l = new ArrayList();
            for (Student str : studentList) {
                System.out.println(str);
            }
        } else if (criteria.equals("date")) {
            Comparator<Student> StuNameComparator = new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    LocalDate StudentName1 = s1.getDateOfBirth();
                    LocalDate StudentName2 = s2.getDateOfBirth();
                    return StudentName1.compareTo(StudentName2);
                }
            };
            System.out.println("Student date of birth Sorting:");
            Collections.sort(studentList, StuNameComparator);

            List l = new ArrayList();
            for (Student str : studentList) {
                System.out.println(str);
            }
        } else {
            throw new InputMismatchException("The type can only be 'name' or 'date'");
        }

    }

    /**
     * Show all students that have the age taken by user input.
     * @param age
     * @return
     * @throws InputMismatchException
     */
    public List showStudentsWithAge(int age) throws InputMismatchException {
        if (age < 0) {
            throw new InputMismatchException("The age cannot be negative");
        } else {
            List studentsWithAge = new ArrayList();
            for (Student s : studentList) {
                int y = Period.between(s.getDateOfBirth(), LocalDate.now()).getYears();
                if (y == age) {
                    studentsWithAge.add(s);
                }
            }
            System.out.println(studentsWithAge);
            return studentsWithAge;
        }
    }
}

