package ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * 1. You need to store Persoane in a TreeSet. Define one comparator for age in reverse order.
 * When used when creating the TreeSet, the comparator will sort the persons in the collection by age from highest to lowest.
 * <p>
 * Add Persons to the TreeSet; iterate through the treeset and print the name and the age;
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
