package ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 *Creating three objects and adding them into a Set
 *
 */

public class Main {
    public static void main(String[] args) {
        Persoane Alex = new Director(37, "Alex");
        Persoane Alin = new Inginer(27, "Alin");
        Persoane Nicu = new Mecanic(30, "Nicu");

        Set<Persoane> setNou = new TreeSet<>(new PersonVarstaComparator());
        setNou.add(Alex);
        setNou.add(Alin);
        setNou.add(Nicu);

        for (Persoane p : setNou) {
            System.out.println(p);
        }
    }
}
