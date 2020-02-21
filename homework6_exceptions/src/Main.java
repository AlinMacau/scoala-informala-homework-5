import javax.naming.InvalidNameException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;

/**
 * Instantiate the studens repository and create logs for exceptions that appear.
 */

public class Main {
    private static Logger logger = Logger.getLogger("my.class.fqn");

    public static void main(String[] args) {
        Repository repo = new Repository();
        logger.info("start");
        try {
            repo.addStudents("", "Macau", "20-11-1992", "m", "1921120090082");
        } catch (InvalidNameException e) {
            logger.log(Level.SEVERE, "the first name cannot be empty");
        } catch (DataFormatException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            repo.addStudents("Alin", "", "20-11-1992", "m", "1921120090082");
        } catch (InvalidNameException e) {
            logger.log(Level.SEVERE, "the last name cannot be empty");
        } catch (DataFormatException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            repo.deleteStudents(" ");
            logger.log(Level.SEVERE, "the ID cannot be empty");
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        try {
            repo.deleteStudents("hgbk,");
            logger.log(Level.SEVERE, "the ID does not exist");
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Insert 'name' if you want to list by the Last Name of 'date' if you want to list by date of birth");
            repo.listBy("idk");
            logger.log(Level.SEVERE, "the type can be only 'name' or 'date'");
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        try {
            repo.showStudentsWithAge(-27);
            logger.log(Level.SEVERE, "he age cannot be negative");
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
