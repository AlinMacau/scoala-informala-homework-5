import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BirthdaySorter bs = new BirthdaySorter();
        bs.getPersonList("homework9_java8/src/list.txt");
        bs.getOrderedList(bs.personList, 2);
        bs.writeList(bs.orderedList);

    }


}
