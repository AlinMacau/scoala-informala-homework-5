import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BirthdaySorter {
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

        for (Person p : lista) {
            if (p.getBirthdate().getMonthValue() == month) {
                orderedList.add(p.getName());
            }
        }


        Collections.sort(orderedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
     }

     public void writeList(List theList){
         try (OutputStreamWriter out = new OutputStreamWriter (new FileOutputStream("out.txt"))) {
             theList.forEach(element -> { try { out.write(element.toString() + "\n"); } catch(IOException e) {} }
             );
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

}
