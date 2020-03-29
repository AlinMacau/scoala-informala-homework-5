import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListReader {
    List<Person> personList = new ArrayList<>();
    List<String> orderedList = new ArrayList<>();


    public void getPersonList(String path) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), StandardCharsets.UTF_8));
        String t;
        while ((t = br.readLine()) != null) {
            String[] person = t.split(",");
            String name = person[0];

            String[] date = person[1].split("-");
            LocalDate birthdate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));

            personList.add(new Person(name, birthdate));
        }
        this.personList = personList;
    }

    public void getOrderedList(List<Person> lista, int month) {
        List<String> orderedList = new ArrayList<>();
        for (Person p : lista) {
            if (p.getBirthdate().getMonthValue() == month) {
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
        this.orderedList = orderedList;
    }

    public void printer(List listToPrint) throws IOException{
        try (BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"))) {
            listToPrint.forEach(element -> {
                out.write(element.toString());
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
