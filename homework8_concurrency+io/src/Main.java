import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p = new Person();
        p.createPerson();

        BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));

        for (int i = 0; i < p.lista.size(); i++) {
            Person person = p.lista.get(i);
            if (person.s.equals(Sex.FEMALE)) {
                out.write("Happy Birthday " + person.getName() + "(" + person.getBirthdate().getYear() + ")!" + "\n");

            }
        }
    }
}
