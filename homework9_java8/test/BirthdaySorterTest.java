import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.io.IOException;

public class BirthdaySorterTest {
    @Test
    public void getPersonListTest() throws IOException {
        BirthdaySorter bs = new BirthdaySorter();
        bs.getPersonList("homework9_java8/test/testList.txt");
        bs.getOrderedList(bs.personList, 2);
        assertEquals("Person{name='Son Willms', birthdate=1955-11-10}",bs.personList.get(0).toString());
        assertEquals("Eufemia Kiehn", bs.orderedList.get(0));

    }    @Test
    public void getOrderedListTest() throws IOException {
        BirthdaySorter bs = new BirthdaySorter();
        bs.getPersonList("homework9_java8/test/testList.txt");
        bs.getOrderedList(bs.personList, 2);
        assertEquals("Eufemia Kiehn", bs.orderedList.get(0));

    }


}
