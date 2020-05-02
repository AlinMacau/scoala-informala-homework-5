import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    LocalDate birthdate;
    Sex s;
    List<Person> lista = new ArrayList<>();

    public Person(String name, LocalDate birthdate, Sex s) {
        this.name = name;
        this.birthdate = birthdate;
        this.s = s;
    }

    public Person() {
    }

    public void createPerson() throws IOException {
        try (BufferedReader br1 = new BufferedReader(new FileReader("homework8_concurrency+io/src/file1.txt"))) {
            String input;
            while ((input = br1.readLine()) != null) {
                String[] person = input.split(",");
                this.name = person[0];

                String[] date = person[1].split("-");
                this.birthdate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));

                String sex = person[2];
                if (sex.equals("male")) {
                    this.s = Sex.MALE;
                }
                if (sex.equals("female")) {
                    this.s = Sex.FEMALE;
                }

                lista.add(new Person(name, birthdate, s));

            }
        }

        try (BufferedReader br1 = new BufferedReader(new FileReader("homework8_concurrency+io/src/file2.txt"))) {
            String input;
            while ((input = br1.readLine()) != null) {
                String[] person = input.split(",");
                this.name = person[0];

                String[] date = person[1].split("-");
                this.birthdate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));

                String sex = person[2];
                if (sex.equals("0")) {
                    this.s = Sex.MALE;
                }
                if (sex.equals("1")) {
                    this.s = Sex.FEMALE;
                }

                lista.add(new Person(name, birthdate, s));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Sex getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", s=" + s +
                '}';
    }


}
