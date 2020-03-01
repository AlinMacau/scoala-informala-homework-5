import org.junit.Assert;
import org.junit.Test;

import javax.naming.InvalidNameException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.zip.DataFormatException;


public class RepositoryTest {
    @Test
    public void testAddStudent() throws ParseException, InvalidNameException, DataFormatException {
        Repository repo1 = new Repository();
        repo1.addStudents("Alin", "Macau", "20-11-1992", "m", "1921120090082");

        Assert.assertEquals(1, repo1.studentList.size());
    }

    @Test(expected = InvalidNameException.class)
    public void testAddStudentWithError() throws ParseException, InvalidNameException, DataFormatException {
        Repository repo1 = new Repository();
        repo1.addStudents("", "Macau", "20-11-1992", "m", "1921120090082");
    }

    @Test
    public void testDeleteStudent() throws DataFormatException, ParseException, InvalidNameException {
        Repository repo1 = new Repository();
        repo1.addStudents("Adelin", "Simtinica", "19-12-1992", "M", "19017451291");
        repo1.deleteStudents("19017451291");
        Assert.assertEquals(0, repo1.studentList.size());
    }

    @Test(expected = InputMismatchException.class)
    public void testDeleteStudentWithError() throws DataFormatException, ParseException, InvalidNameException {
        Repository repo1 = new Repository();
        repo1.addStudents("Adelin", "Simtinica", "19-12-1992", "M", "19017451291");
        repo1.deleteStudents("");
    }

    @Test
    public void testListBy() throws ParseException, InvalidNameException, DataFormatException {
        Repository repo1 = new Repository();
        Repository repo2 = new Repository();

        repo1.addStudents("Alin", "Macau", "20-11-1992", "m", "1921120090082");
        repo1.addStudents("Adelin", "Simtinica", "19-12-1992", "m", "1921219090083");
        repo1.addStudents("Alex", "Rosu", "12-02-1980", "M", "1800212090081");
        repo1.listBy("date");

        repo2.addStudents("Alex", "Rosu", "12-02-1980", "M", "1800212090081");
        repo2.addStudents("Alin", "Macau", "20-11-1992", "m", "1921120090082");
        repo2.addStudents("Adelin", "Simtinica", "19-12-1992", "m", "1921219090083");

        Assert.assertEquals(repo2.studentList.toString(), repo1.studentList.toString());
    }

    @Test(expected = InputMismatchException.class)
    public void testListBytWithError() throws DataFormatException, ParseException, InvalidNameException {
        Repository repo1 = new Repository();
        repo1.addStudents("Adelin", "Simtinica", "19-12-1992", "M", "19017451291");
        repo1.listBy("");
    }

    @Test
    public void testshowStudentsWithAge() throws DataFormatException, ParseException, InvalidNameException {
        Repository repo1 = new Repository();
        repo1.addStudents("Alin", "Macau", "20-11-1992", "m", "1921120090082");
        repo1.addStudents("Adelin", "Simtinica", "19-12-1992", "m", "1921219090083");
        repo1.addStudents("Alex", "Rosu", "12-02-1980", "M", "1800212090081");
        repo1.showStudentsWithAge(27);

        Repository repo2 = new Repository();
        repo2.addStudents("Alin", "Macau", "20-11-1992", "m", "1921120090082");
        repo2.addStudents("Adelin", "Simtinica", "19-12-1992", "m", "1921219090083");

        Assert.assertEquals(repo2.studentList.toString(), repo1.showStudentsWithAge(27).toString());
    }

    @Test(expected = InputMismatchException.class)
    public void testShowStudentsWithAgeWithError() throws DataFormatException, ParseException, InvalidNameException {
        Repository repo1 = new Repository();
        repo1.addStudents("Alin", "Macau", "20-11-1992", "m", "1921120090082");
        repo1.addStudents("Adelin", "Simtinica", "19-12-1992", "m", "1921219090083");
        repo1.addStudents("Alex", "Rosu", "12-02-1980", "M", "1800212090081");
        repo1.showStudentsWithAge(-2);
    }
}
