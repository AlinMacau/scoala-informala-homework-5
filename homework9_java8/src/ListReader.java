import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListReader {
    List<Person> personList = new ArrayList<>();

    public void getPersonList(String path) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t;
        while ((t = br.readLine()) != null) {
            String[] person = t.split(",");
            String name = person[0];

            String[] date = person[1].split("-");
            LocalDate birthdate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));

            System.out.println(new Person(name, birthdate));
        }
//        this.personList = personList;
    }

    public void getOrderedList(List<Person> lista, int month) {
        List<String> orderedList = new ArrayList<>();
        for (Person p : lista) {
            if (p.getBirthdate().getDayOfMonth() == month) {
                orderedList.add(p.getName());
            }
        }

        System.out.println(orderedList);

        Collections.sort(orderedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        try (BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
